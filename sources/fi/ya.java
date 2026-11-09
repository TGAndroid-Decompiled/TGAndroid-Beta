package fi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class ya {
    public final org.telegram.ui.Components.w5 f13219a;
    public final int f13220b;
    public final short[] d;
    public short f13222e;
    public final MediaExtractor f13223f;
    public final MediaFormat f13224g;
    public final long h;
    public final FfmpegAudioWaveformLoader f13227k;
    public final fb f13228l;
    public int f13221c = 0;
    public final Object f13225i = new Object();
    public boolean f13226j = false;

    public ya(fb fbVar, String str, int i7) {
        long j3;
        this.f13228l = fbVar;
        this.f13219a = new org.telegram.ui.Components.w5(fbVar, 0L, 600L, xq.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f13223f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f13223f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f13223f.selectTrack(i10);
                        this.f13224g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f13224g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ab abVar = fbVar.h;
        if (abVar != null) {
            j3 = abVar.f11622e;
        } else if (!fbVar.f12033s.isEmpty()) {
            j3 = fbVar.getBaseDuration();
        } else if (fbVar.E) {
            j3 = fbVar.H;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, fbVar.getMaxScrollDuration()))) * i7) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.f13220b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f13224g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new v9(this, 4));
            } else {
                this.f13227k = new FfmpegAudioWaveformLoader(str, min, new ai.e(this, 23));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f13227k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new v9(this, 4));
        synchronized (this.f13225i) {
            this.f13226j = true;
        }
    }

    public final void b(short[] sArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f13221c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s5 = this.f13222e;
            short s9 = sArr[i10];
            if (s5 < s9) {
                this.f13222e = s9;
            }
        }
        this.f13221c += i7;
        this.f13228l.invalidate();
    }
}
