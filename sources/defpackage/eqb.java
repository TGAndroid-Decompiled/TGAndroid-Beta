package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class eqb {
    public final ln a;
    public final int b;
    public final short[] d;
    public short e;
    public final MediaExtractor f;
    public final MediaFormat g;
    public final long h;
    public final FfmpegAudioWaveformLoader k;
    public final lqb l;
    public int c = 0;
    public final Object i = new Object();
    public boolean j = false;

    public eqb(lqb lqbVar, String str, int i) {
        long j;
        this.l = lqbVar;
        this.a = new ln(lqbVar, 0L, 600L, d53.h);
        int i2 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i2 < trackCount) {
                    MediaFormat trackFormat = this.f.getTrackFormat(i2);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f.selectTrack(i2);
                        this.g = trackFormat;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        gqb gqbVar = lqbVar.h;
        if (gqbVar != null) {
            j = gqbVar.e;
        } else if (!lqbVar.s.isEmpty()) {
            j = lqbVar.getBaseDuration();
        } else if (lqbVar.F) {
            j = lqbVar.I;
        } else {
            j = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j, lqbVar.getMaxScrollDuration()))) * i) / Math.round(gm.N(3.3333f))), 4000);
        this.b = min;
        this.d = new short[min];
        if (this.h > 0 && this.g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new zcb(this, (byte) 15));
            } else {
                this.k = new FfmpegAudioWaveformLoader(str, min, new o6b(this, (byte) 5));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new zcb(this, (byte) 15));
        synchronized (this.i) {
            this.j = true;
        }
    }

    public final void b(short[] sArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.c + i2;
            short[] sArr2 = this.d;
            if (i3 >= sArr2.length) {
                break;
            }
            sArr2[i3] = sArr[i2];
            short s = this.e;
            short s2 = sArr[i2];
            if (s < s2) {
                this.e = s2;
            }
        }
        this.c += i;
        this.l.invalidate();
    }
}
