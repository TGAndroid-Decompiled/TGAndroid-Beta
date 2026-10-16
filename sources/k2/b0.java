package k2;

import android.media.AudioTrack;
import ji.w4;
public final class b0 {
    public final a0 f13850a;
    public final int f13851b;
    public final w4 f13852c;
    public int d;
    public long e;
    public long f13853f;
    public long f13854g;
    public long h;
    public long f13855i;

    public b0(AudioTrack audioTrack, w4 w4Var) {
        this.f13850a = new a0(audioTrack);
        this.f13851b = audioTrack.getSampleRate();
        this.f13852c = w4Var;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f13853f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f13853f = 10000000L;
                return;
            }
            this.f13853f = 10000L;
            return;
        }
        this.f13854g = 0L;
        this.h = -1L;
        this.f13855i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f13853f = 10000L;
    }
}
