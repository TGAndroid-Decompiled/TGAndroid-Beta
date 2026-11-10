package n2;

import android.media.AudioTrack;
public final class z {
    public final y f20353a;
    public final int f20354b;
    public final g6.d0 f20355c;
    public int d;
    public long f20356e;
    public long f20357f;
    public long f20358g;
    public long h;
    public long f20359i;

    public z(AudioTrack audioTrack, g6.d0 d0Var) {
        this.f20353a = new y(audioTrack);
        this.f20354b = audioTrack.getSampleRate();
        this.f20355c = d0Var;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f20357f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f20357f = 10000000L;
                return;
            }
            this.f20357f = 10000L;
            return;
        }
        this.f20358g = 0L;
        this.h = -1L;
        this.f20359i = -9223372036854775807L;
        this.f20356e = System.nanoTime() / 1000;
        this.f20357f = 10000L;
    }
}
