package n2;

import android.media.AudioTrack;
public final class z {
    public final y f20345a;
    public final int f20346b;
    public final g6.d0 f20347c;
    public int d;
    public long f20348e;
    public long f20349f;
    public long f20350g;
    public long h;
    public long f20351i;

    public z(AudioTrack audioTrack, g6.d0 d0Var) {
        this.f20345a = new y(audioTrack);
        this.f20346b = audioTrack.getSampleRate();
        this.f20347c = d0Var;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f20349f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f20349f = 10000000L;
                return;
            }
            this.f20349f = 10000L;
            return;
        }
        this.f20350g = 0L;
        this.h = -1L;
        this.f20351i = -9223372036854775807L;
        this.f20348e = System.nanoTime() / 1000;
        this.f20349f = 10000L;
    }
}
