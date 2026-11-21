package n2;

import android.media.AudioTrack;
import hi.w4;
public final class z {
    public final y f21312a;
    public final int f21313b;
    public final w4 f21314c;
    public int d;
    public long f21315e;
    public long f21316f;
    public long f21317g;
    public long h;
    public long f21318i;

    public z(AudioTrack audioTrack, w4 w4Var) {
        this.f21312a = new y(audioTrack);
        this.f21313b = audioTrack.getSampleRate();
        this.f21314c = w4Var;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f21316f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f21316f = 10000000L;
                return;
            }
            this.f21316f = 10000L;
            return;
        }
        this.f21317g = 0L;
        this.h = -1L;
        this.f21318i = -9223372036854775807L;
        this.f21315e = System.nanoTime() / 1000;
        this.f21316f = 10000L;
    }
}
