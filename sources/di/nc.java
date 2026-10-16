package di;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class nc {
    public final org.telegram.ui.Components.g6 f7483a;
    public final int f7484b;
    public final short[] d;
    public short e;
    public final MediaExtractor f7486f;
    public final MediaFormat f7487g;
    public final long h;
    public final FfmpegAudioWaveformLoader f7490k;
    public final uc f7491l;
    public int f7485c = 0;
    public final Object f7488i = new Object();
    public boolean f7489j = false;

    public nc(uc ucVar, String str, int i10) {
        long j10;
        this.f7491l = ucVar;
        this.f7483a = new org.telegram.ui.Components.g6(ucVar, 0L, 600L, es.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f7486f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f7486f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f7486f.selectTrack(i11);
                        this.f7487g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f7487g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        pc pcVar = ucVar.h;
        if (pcVar != null) {
            j10 = pcVar.e;
        } else if (!ucVar.f7951s.isEmpty()) {
            j10 = ucVar.getBaseDuration();
        } else if (ucVar.E) {
            j10 = ucVar.H;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, ucVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f7484b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f7487g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new x8(this, 7));
            } else {
                this.f7490k = new FfmpegAudioWaveformLoader(str, min, new ci.u(this, 9));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f7490k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new x8(this, 7));
        synchronized (this.f7488i) {
            this.f7489j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f7485c;
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
        this.f7485c += i10;
        this.f7491l.invalidate();
    }
}
