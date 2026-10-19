package bh;

import org.telegram.messenger.MediaDataController;
public final class a {
    public boolean f4355a;
    public long f4356b;

    public void a(long j10) {
        this.f4356b = MediaDataController.calcHash(this.f4356b, j10);
    }

    public void b(boolean z10) {
        long j10;
        if (z10) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        a(j10);
    }

    public void c(float f7) {
        a(Float.floatToIntBits(f7));
    }
}
