package n2;

import android.media.AudioTrack;
import hi.w4;
public final class z {
    public final y f21315a;
    public final int f21316b;
    public final w4 f21317c;
    public int d;
    public long f21318e;
    public long f21319f;
    public long f21320g;
    public long h;
    public long f21321i;

    public z(AudioTrack audioTrack, w4 w4Var) {
        this.f21315a = new y(audioTrack);
        this.f21316b = audioTrack.getSampleRate();
        this.f21317c = w4Var;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f21319f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f21319f = 10000000L;
                return;
            }
            this.f21319f = 10000L;
            return;
        }
        this.f21320g = 0L;
        this.h = -1L;
        this.f21321i = -9223372036854775807L;
        this.f21318e = System.nanoTime() / 1000;
        this.f21319f = 10000L;
    }
}
