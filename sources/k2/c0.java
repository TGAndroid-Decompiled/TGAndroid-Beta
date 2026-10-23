package k2;

import android.media.AudioTrack;
public final class c0 {
    public final b0 f14697a;
    public final int f14698b;
    public final ya.c f14699c;
    public int d;
    public long e;
    public long f14700f;
    public long f14701g;
    public long h;
    public long f14702i;

    public c0(AudioTrack audioTrack, ya.c cVar) {
        this.f14697a = new b0(audioTrack);
        this.f14698b = audioTrack.getSampleRate();
        this.f14699c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14700f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14700f = 10000000L;
                return;
            }
            this.f14700f = 10000L;
            return;
        }
        this.f14701g = 0L;
        this.h = -1L;
        this.f14702i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f14700f = 10000L;
    }
}
