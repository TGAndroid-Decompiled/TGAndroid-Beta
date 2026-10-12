package k2;

import android.media.AudioTrack;
public final class r {
    public final q f14529a;
    public final int f14530b;
    public final xa.c f14531c;
    public int d;
    public long f14532e;
    public long f14533f;
    public long f14534g;
    public long h;
    public long f14535i;

    public r(AudioTrack audioTrack, xa.c cVar) {
        this.f14529a = new q(audioTrack);
        this.f14530b = audioTrack.getSampleRate();
        this.f14531c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14533f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14533f = 10000000L;
                return;
            }
            this.f14533f = 10000L;
            return;
        }
        this.f14534g = 0L;
        this.h = -1L;
        this.f14535i = -9223372036854775807L;
        this.f14532e = System.nanoTime() / 1000;
        this.f14533f = 10000L;
    }
}
