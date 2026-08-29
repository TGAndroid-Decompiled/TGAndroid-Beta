package g;

import org.telegram.messenger.MediaDataController;
public final class x {
    public long f6955a;
    public boolean f6956b;

    public void a(long j10) {
        this.f6955a = MediaDataController.calcHash(this.f6955a, j10);
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

    public void c(float f9) {
        a(Float.floatToIntBits(f9));
    }
}
