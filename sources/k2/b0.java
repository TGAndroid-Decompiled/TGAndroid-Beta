package k2;

import android.media.AudioTrack;
public final class b0 {
    public final a0 f14649a;
    public final int f14650b;
    public final ya.d f14651c;
    public int d;
    public long e;
    public long f14652f;
    public long f14653g;
    public long h;
    public long f14654i;

    public b0(AudioTrack audioTrack, ya.d dVar) {
        this.f14649a = new a0(audioTrack);
        this.f14650b = audioTrack.getSampleRate();
        this.f14651c = dVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14652f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14652f = 10000000L;
                return;
            }
            this.f14652f = 10000L;
            return;
        }
        this.f14653g = 0L;
        this.h = -1L;
        this.f14654i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f14652f = 10000L;
    }
}
