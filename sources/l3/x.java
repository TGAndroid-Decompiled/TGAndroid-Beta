package l3;

import android.media.AudioTrack;
public final class x {
    public final w f11648a;
    public int f11649b;
    public long f11650c;
    public long d;
    public long f11651e;
    public long f11652f;

    public x(AudioTrack audioTrack) {
        if (h5.d0.f7237a >= 19) {
            this.f11648a = new w(audioTrack);
            a();
            return;
        }
        this.f11648a = null;
        b(3);
    }

    public final void a() {
        if (this.f11648a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f11649b = i10;
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
        this.f11651e = 0L;
        this.f11652f = -1L;
        this.f11650c = System.nanoTime() / 1000;
        this.d = 10000L;
    }
}
