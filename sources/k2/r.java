package k2;

import android.media.AudioTrack;
public final class r {
    public final q f14530a;
    public final int f14531b;
    public final xa.c f14532c;
    public int d;
    public long f14533e;
    public long f14534f;
    public long f14535g;
    public long h;
    public long f14536i;

    public r(AudioTrack audioTrack, xa.c cVar) {
        this.f14530a = new q(audioTrack);
        this.f14531b = audioTrack.getSampleRate();
        this.f14532c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14534f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14534f = 10000000L;
                return;
            }
            this.f14534f = 10000L;
            return;
        }
        this.f14535g = 0L;
        this.h = -1L;
        this.f14536i = -9223372036854775807L;
        this.f14533e = System.nanoTime() / 1000;
        this.f14534f = 10000L;
    }
}
