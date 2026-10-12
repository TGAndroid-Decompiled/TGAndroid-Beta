package k2;

import android.media.AudioTrack;
import ji.w4;
public final class b0 {
    public final a0 f13847a;
    public final int f13848b;
    public final w4 f13849c;
    public int d;
    public long e;
    public long f13850f;
    public long f13851g;
    public long h;
    public long f13852i;

    public b0(AudioTrack audioTrack, w4 w4Var) {
        this.f13847a = new a0(audioTrack);
        this.f13848b = audioTrack.getSampleRate();
        this.f13849c = w4Var;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f13850f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f13850f = 10000000L;
                return;
            }
            this.f13850f = 10000L;
            return;
        }
        this.f13851g = 0L;
        this.h = -1L;
        this.f13852i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f13850f = 10000L;
    }
}
