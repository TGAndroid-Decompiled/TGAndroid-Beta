package k2;

import android.media.AudioTrack;
public final class r {
    public final q f14532a;
    public final int f14533b;
    public final xa.c f14534c;
    public int d;
    public long f14535e;
    public long f14536f;
    public long f14537g;
    public long h;
    public long f14538i;

    public r(AudioTrack audioTrack, xa.c cVar) {
        this.f14532a = new q(audioTrack);
        this.f14533b = audioTrack.getSampleRate();
        this.f14534c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14536f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14536f = 10000000L;
                return;
            }
            this.f14536f = 10000L;
            return;
        }
        this.f14537g = 0L;
        this.h = -1L;
        this.f14538i = -9223372036854775807L;
        this.f14535e = System.nanoTime() / 1000;
        this.f14536f = 10000L;
    }
}
