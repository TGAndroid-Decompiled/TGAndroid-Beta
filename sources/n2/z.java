package n2;

import android.media.AudioTrack;
import hi.x4;
public final class z {
    public final y f21281a;
    public final int f21282b;
    public final x4 f21283c;
    public int d;
    public long f21284e;
    public long f21285f;
    public long f21286g;
    public long h;
    public long f21287i;

    public z(AudioTrack audioTrack, x4 x4Var) {
        this.f21281a = new y(audioTrack);
        this.f21282b = audioTrack.getSampleRate();
        this.f21283c = x4Var;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f21285f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f21285f = 10000000L;
                return;
            }
            this.f21285f = 10000L;
            return;
        }
        this.f21286g = 0L;
        this.h = -1L;
        this.f21287i = -9223372036854775807L;
        this.f21284e = System.nanoTime() / 1000;
        this.f21285f = 10000L;
    }
}
