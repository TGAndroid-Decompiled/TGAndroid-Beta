package j3;

import android.media.AudioTrack;
public final class u {
    public final t f13355a;
    public int f13356b;
    public long f13357c;
    public long d;
    public long f13358e;
    public long f13359f;

    public u(AudioTrack audioTrack) {
        if (d5.f0.f4349a >= 19) {
            this.f13355a = new t(audioTrack);
            a();
            return;
        }
        this.f13355a = null;
        b(3);
    }

    public final void a() {
        if (this.f13355a != null) {
            b(0);
        }
    }

    public final void b(int i9) {
        this.f13356b = i9;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2 && i9 != 3) {
                    if (i9 == 4) {
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
        this.f13358e = 0L;
        this.f13359f = -1L;
        this.f13357c = System.nanoTime() / 1000;
        this.d = 10000L;
    }
}
