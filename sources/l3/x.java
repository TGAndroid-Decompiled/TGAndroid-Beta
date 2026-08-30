package l3;

import android.media.AudioTrack;
public final class x {
    public final w f11277a;
    public int f11278b;
    public long f11279c;
    public long d;
    public long e;
    public long f11280f;

    public x(AudioTrack audioTrack) {
        if (h5.d0.f6937a >= 19) {
            this.f11277a = new w(audioTrack);
            a();
            return;
        }
        this.f11277a = null;
        b(3);
    }

    public final void a() {
        if (this.f11277a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f11278b = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.d = 10000000L;
                return;
            }
            this.d = 10000L;
            return;
        }
        this.e = 0L;
        this.f11280f = -1L;
        this.f11279c = System.nanoTime() / 1000;
        this.d = 10000L;
    }
}
