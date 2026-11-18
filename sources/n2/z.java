package n2;

import android.media.AudioTrack;
import hi.w4;
public final class z {
    public final y f21284a;
    public final int f21285b;
    public final w4 f21286c;
    public int d;
    public long f21287e;
    public long f21288f;
    public long f21289g;
    public long h;
    public long f21290i;

    public z(AudioTrack audioTrack, w4 w4Var) {
        this.f21284a = new y(audioTrack);
        this.f21285b = audioTrack.getSampleRate();
        this.f21286c = w4Var;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f21288f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f21288f = 10000000L;
                return;
            }
            this.f21288f = 10000L;
            return;
        }
        this.f21289g = 0L;
        this.h = -1L;
        this.f21290i = -9223372036854775807L;
        this.f21287e = System.nanoTime() / 1000;
        this.f21288f = 10000L;
    }
}
