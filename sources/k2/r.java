package k2;

import android.media.AudioTrack;
public final class r {
    public final q f14642a;
    public final int f14643b;
    public final xa.c f14644c;
    public int d;
    public long f14645e;
    public long f14646f;
    public long f14647g;
    public long h;
    public long f14648i;

    public r(AudioTrack audioTrack, xa.c cVar) {
        this.f14642a = new q(audioTrack);
        this.f14643b = audioTrack.getSampleRate();
        this.f14644c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14646f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14646f = 10000000L;
                return;
            }
            this.f14646f = 10000L;
            return;
        }
        this.f14647g = 0L;
        this.h = -1L;
        this.f14648i = -9223372036854775807L;
        this.f14645e = System.nanoTime() / 1000;
        this.f14646f = 10000L;
    }
}
