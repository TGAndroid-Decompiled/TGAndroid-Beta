package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class qb {
    public final org.telegram.ui.Components.c6 f15247a;
    public final int f15248b;
    public final short[] d;
    public short f15250e;
    public final MediaExtractor f15251f;
    public final MediaFormat f15252g;
    public final long h;
    public final FfmpegAudioWaveformLoader f15255k;
    public final xb f15256l;
    public int f15249c = 0;
    public final Object f15253i = new Object();
    public boolean f15254j = false;

    public qb(xb xbVar, String str, int i7) {
        long j3;
        this.f15256l = xbVar;
        this.f15247a = new org.telegram.ui.Components.c6(xbVar, 0L, 600L, kr.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f15251f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f15251f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f15251f.selectTrack(i10);
                        this.f15252g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f15252g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        sb sbVar = xbVar.h;
        if (sbVar != null) {
            j3 = sbVar.f15411e;
        } else if (!xbVar.f15832s.isEmpty()) {
            j3 = xbVar.getBaseDuration();
        } else if (xbVar.F) {
            j3 = xbVar.I;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, xbVar.getMaxScrollDuration()))) * i7) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.f15248b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f15252g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new w(this, 22));
            } else {
                this.f15255k = new FfmpegAudioWaveformLoader(str, min, new y7(this, 2));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f15255k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new w(this, 22));
        synchronized (this.f15253i) {
            this.f15254j = true;
        }
    }

    public final void b(short[] sArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f15249c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s5 = this.f15250e;
            short s9 = sArr[i10];
            if (s5 < s9) {
                this.f15250e = s9;
            }
        }
        this.f15249c += i7;
        this.f15256l.invalidate();
    }
}
