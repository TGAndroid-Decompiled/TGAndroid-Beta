package k2;

import android.media.AudioTrack;
public final class r {
    public final q f14668a;
    public final int f14669b;
    public final xa.c f14670c;
    public int d;
    public long f14671e;
    public long f14672f;
    public long f14673g;
    public long h;
    public long f14674i;

    public r(AudioTrack audioTrack, xa.c cVar) {
        this.f14668a = new q(audioTrack);
        this.f14669b = audioTrack.getSampleRate();
        this.f14670c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14672f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14672f = 10000000L;
                return;
            }
            this.f14672f = 10000L;
            return;
        }
        this.f14673g = 0L;
        this.h = -1L;
        this.f14674i = -9223372036854775807L;
        this.f14671e = System.nanoTime() / 1000;
        this.f14672f = 10000L;
    }
}
