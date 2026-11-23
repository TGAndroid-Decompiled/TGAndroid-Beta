package n2;

import android.media.AudioTrack;
public final class z {
    public final y f21380a;
    public final int f21381b;
    public final h6.o f21382c;
    public int d;
    public long f21383e;
    public long f21384f;
    public long f21385g;
    public long h;
    public long f21386i;

    public z(AudioTrack audioTrack, h6.o oVar) {
        this.f21380a = new y(audioTrack);
        this.f21381b = audioTrack.getSampleRate();
        this.f21382c = oVar;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f21384f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f21384f = 10000000L;
                return;
            }
            this.f21384f = 10000L;
            return;
        }
        this.f21385g = 0L;
        this.h = -1L;
        this.f21386i = -9223372036854775807L;
        this.f21383e = System.nanoTime() / 1000;
        this.f21384f = 10000L;
    }
}
