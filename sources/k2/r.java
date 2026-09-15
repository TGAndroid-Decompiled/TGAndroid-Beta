package k2;

import android.media.AudioTrack;
public final class r {
    public final q f13351a;
    public final int f13352b;
    public final c0 f13353c;
    public int d;
    public long e;
    public long f13354f;
    public long f13355g;
    public long h;
    public long f13356i;

    public r(AudioTrack audioTrack, c0 c0Var) {
        this.f13351a = new q(audioTrack);
        this.f13352b = audioTrack.getSampleRate();
        this.f13353c = c0Var;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f13354f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f13354f = 10000000L;
                return;
            }
            this.f13354f = 10000L;
            return;
        }
        this.f13355g = 0L;
        this.h = -1L;
        this.f13356i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f13354f = 10000L;
    }
}
