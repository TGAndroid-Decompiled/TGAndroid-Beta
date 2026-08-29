package l3;

import android.media.AudioTrack;
public final class v {
    public final u f14214a;
    public int f14215b;
    public long f14216c;
    public long d;
    public long f14217e;
    public long f14218f;

    public v(AudioTrack audioTrack) {
        if (f5.d0.f6579a >= 19) {
            this.f14214a = new u(audioTrack);
            a();
            return;
        }
        this.f14214a = null;
        b(3);
    }

    public final void a() {
        if (this.f14214a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f14215b = i10;
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
        this.f14217e = 0L;
        this.f14218f = -1L;
        this.f14216c = System.nanoTime() / 1000;
        this.d = 10000L;
    }
}
