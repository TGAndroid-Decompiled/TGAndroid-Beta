package di;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class nc {
    public final org.telegram.ui.Components.g6 f7480a;
    public final int f7481b;
    public final short[] d;
    public short e;
    public final MediaExtractor f7483f;
    public final MediaFormat f7484g;
    public final long h;
    public final FfmpegAudioWaveformLoader f7487k;
    public final uc f7488l;
    public int f7482c = 0;
    public final Object f7485i = new Object();
    public boolean f7486j = false;

    public nc(uc ucVar, String str, int i10) {
        long j10;
        this.f7488l = ucVar;
        this.f7480a = new org.telegram.ui.Components.g6(ucVar, 0L, 600L, es.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f7483f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f7483f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f7483f.selectTrack(i11);
                        this.f7484g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f7484g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        pc pcVar = ucVar.h;
        if (pcVar != null) {
            j10 = pcVar.e;
        } else if (!ucVar.f7948s.isEmpty()) {
            j10 = ucVar.getBaseDuration();
        } else if (ucVar.E) {
            j10 = ucVar.H;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, ucVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f7481b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f7484g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new x8(this, 7));
            } else {
                this.f7487k = new FfmpegAudioWaveformLoader(str, min, new ci.u(this, 9));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f7487k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new x8(this, 7));
        synchronized (this.f7485i) {
            this.f7486j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f7482c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s10 = this.e;
            short s11 = sArr[i11];
            if (s10 < s11) {
                this.e = s11;
            }
        }
        this.f7482c += i10;
        this.f7488l.invalidate();
    }
}
