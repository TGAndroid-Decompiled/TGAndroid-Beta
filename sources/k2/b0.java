package k2;

import android.media.AudioTrack;
public final class b0 {
    public final a0 f14652a;
    public final int f14653b;
    public final ya.c f14654c;
    public int d;
    public long e;
    public long f14655f;
    public long f14656g;
    public long h;
    public long f14657i;

    public b0(AudioTrack audioTrack, ya.c cVar) {
        this.f14652a = new a0(audioTrack);
        this.f14653b = audioTrack.getSampleRate();
        this.f14654c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14655f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14655f = 10000000L;
                return;
            }
            this.f14655f = 10000L;
            return;
        }
        this.f14656g = 0L;
        this.h = -1L;
        this.f14657i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f14655f = 10000L;
    }
}
