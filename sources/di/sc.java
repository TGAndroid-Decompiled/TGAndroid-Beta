package di;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class sc {
    public final org.telegram.ui.Components.e6 f8165a;
    public final int f8166b;
    public final short[] d;
    public short f8168e;
    public final MediaExtractor f8169f;
    public final MediaFormat f8170g;
    public final long h;
    public final FfmpegAudioWaveformLoader f8173k;
    public final zc f8174l;
    public int f8167c = 0;
    public final Object f8171i = new Object();
    public boolean f8172j = false;

    public sc(zc zcVar, String str, int i10) {
        long j3;
        this.f8174l = zcVar;
        this.f8165a = new org.telegram.ui.Components.e6(zcVar, 0L, 600L, pr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f8169f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f8169f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f8169f.selectTrack(i11);
                        this.f8170g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f8170g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        uc ucVar = zcVar.h;
        if (ucVar != null) {
            j3 = ucVar.f8294e;
        } else if (!zcVar.f8604s.isEmpty()) {
            j3 = zcVar.getBaseDuration();
        } else if (zcVar.E) {
            j3 = zcVar.H;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, zcVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f8166b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f8170g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new nb(this, 4));
            } else {
                this.f8173k = new FfmpegAudioWaveformLoader(str, min, new ci.u(this, 9));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f8173k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new nb(this, 4));
        synchronized (this.f8171i) {
            this.f8172j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f8167c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s10 = this.f8168e;
            short s11 = sArr[i11];
            if (s10 < s11) {
                this.f8168e = s11;
            }
        }
        this.f8167c += i10;
        this.f8174l.invalidate();
    }
}
