package k2;

import android.media.AudioTrack;
public final class b0 {
    public final a0 f14651a;
    public final int f14652b;
    public final ya.d f14653c;
    public int d;
    public long e;
    public long f14654f;
    public long f14655g;
    public long h;
    public long f14656i;

    public b0(AudioTrack audioTrack, ya.d dVar) {
        this.f14651a = new a0(audioTrack);
        this.f14652b = audioTrack.getSampleRate();
        this.f14653c = dVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14654f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14654f = 10000000L;
                return;
            }
            this.f14654f = 10000L;
            return;
        }
        this.f14655g = 0L;
        this.h = -1L;
        this.f14656i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f14654f = 10000L;
    }
}
