package bh;

import org.telegram.messenger.MediaDataController;
public final class a {
    public boolean f2740a;
    public long f2741b;

    public void a(long j10) {
        this.f2741b = MediaDataController.calcHash(this.f2741b, j10);
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
