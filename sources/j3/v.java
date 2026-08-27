package j3;

import android.media.AudioTrack;

public final class v {

    public final u f12462a;

    public int f12463b;

    public long f12464c;
    public long d;

    public long f12465e;

    public long f12466f;

    public v(AudioTrack audioTrack) {
        if (d5.g0.f4795a >= 19) {
            this.f12462a = new u(audioTrack);
            a();
        } else {
            this.f12462a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f12462a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f12463b = i10;
        if (i10 == 0) {
            this.f12465e = 0L;
            this.f12466f = -1L;
            this.f12464c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
