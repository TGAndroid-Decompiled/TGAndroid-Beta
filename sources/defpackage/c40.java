package defpackage;

import android.media.AudioTrack;
public final class c40 {
    public final b40 a;
    public final int b;
    public final wz4 c;
    public byte d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    public c40(AudioTrack audioTrack, wz4 wz4Var) {
        this.a = new b40(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = wz4Var;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.f = 500000;
                        return;
                    } else {
                        grb.g();
                        return;
                    }
                }
                this.f = 10000000;
                return;
            }
            this.f = 10000;
            return;
        }
        this.g = 0L;
        this.h = -1L;
        this.i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f = 10000;
    }
}
