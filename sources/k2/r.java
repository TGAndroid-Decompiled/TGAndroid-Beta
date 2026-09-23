package k2;

import android.media.AudioTrack;
public final class r {
    public final q f13340a;
    public final int f13341b;
    public final b0 f13342c;
    public int d;
    public long e;
    public long f13343f;
    public long f13344g;
    public long h;
    public long f13345i;

    public r(AudioTrack audioTrack, b0 b0Var) {
        this.f13340a = new q(audioTrack);
        this.f13341b = audioTrack.getSampleRate();
        this.f13342c = b0Var;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f13343f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f13343f = 10000000L;
                return;
            }
            this.f13343f = 10000L;
            return;
        }
        this.f13344g = 0L;
        this.h = -1L;
        this.f13345i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f13343f = 10000L;
    }
}
