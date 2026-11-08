package n2;

import android.media.AudioTrack;
public final class z {
    public final y f20348a;
    public final int f20349b;
    public final g6.d0 f20350c;
    public int d;
    public long f20351e;
    public long f20352f;
    public long f20353g;
    public long h;
    public long f20354i;

    public z(AudioTrack audioTrack, g6.d0 d0Var) {
        this.f20348a = new y(audioTrack);
        this.f20349b = audioTrack.getSampleRate();
        this.f20350c = d0Var;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f20352f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f20352f = 10000000L;
                return;
            }
            this.f20352f = 10000L;
            return;
        }
        this.f20353g = 0L;
        this.h = -1L;
        this.f20354i = -9223372036854775807L;
        this.f20351e = System.nanoTime() / 1000;
        this.f20352f = 10000L;
    }
}
