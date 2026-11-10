package fi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class ya {
    public final org.telegram.ui.Components.v5 f13221a;
    public final int f13222b;
    public final short[] d;
    public short f13224e;
    public final MediaExtractor f13225f;
    public final MediaFormat f13226g;
    public final long h;
    public final FfmpegAudioWaveformLoader f13229k;
    public final fb f13230l;
    public int f13223c = 0;
    public final Object f13227i = new Object();
    public boolean f13228j = false;

    public ya(fb fbVar, String str, int i7) {
        long j3;
        this.f13230l = fbVar;
        this.f13221a = new org.telegram.ui.Components.v5(fbVar, 0L, 600L, wq.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f13225f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f13225f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f13225f.selectTrack(i10);
                        this.f13226g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f13226g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ab abVar = fbVar.h;
        if (abVar != null) {
            j3 = abVar.f11627e;
        } else if (!fbVar.f12037s.isEmpty()) {
            j3 = fbVar.getBaseDuration();
        } else if (fbVar.E) {
            j3 = fbVar.H;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, fbVar.getMaxScrollDuration()))) * i7) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.f13222b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f13226g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new v9(this, 4));
            } else {
                this.f13229k = new FfmpegAudioWaveformLoader(str, min, new ai.e(this, 23));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f13229k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new v9(this, 4));
        synchronized (this.f13227i) {
            this.f13228j = true;
        }
    }

    public final void b(short[] sArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f13223c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s5 = this.f13224e;
            short s9 = sArr[i10];
            if (s5 < s9) {
                this.f13224e = s9;
            }
        }
        this.f13223c += i7;
        this.f13230l.invalidate();
    }
}
