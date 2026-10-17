package k2;

import android.media.AudioTrack;
public final class b0 {
    public final a0 f14645a;
    public final int f14646b;
    public final ya.c f14647c;
    public int d;
    public long e;
    public long f14648f;
    public long f14649g;
    public long h;
    public long f14650i;

    public b0(AudioTrack audioTrack, ya.c cVar) {
        this.f14645a = new a0(audioTrack);
        this.f14646b = audioTrack.getSampleRate();
        this.f14647c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14648f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14648f = 10000000L;
                return;
            }
            this.f14648f = 10000L;
            return;
        }
        this.f14649g = 0L;
        this.h = -1L;
        this.f14650i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f14648f = 10000L;
    }
}
