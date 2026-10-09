package k2;

import android.media.AudioTrack;
public final class r {
    public final q f14533a;
    public final int f14534b;
    public final xa.d f14535c;
    public int d;
    public long f14536e;
    public long f14537f;
    public long f14538g;
    public long h;
    public long f14539i;

    public r(AudioTrack audioTrack, xa.d dVar) {
        this.f14533a = new q(audioTrack);
        this.f14534b = audioTrack.getSampleRate();
        this.f14535c = dVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14537f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14537f = 10000000L;
                return;
            }
            this.f14537f = 10000L;
            return;
        }
        this.f14538g = 0L;
        this.h = -1L;
        this.f14539i = -9223372036854775807L;
        this.f14536e = System.nanoTime() / 1000;
        this.f14537f = 10000L;
    }
}
