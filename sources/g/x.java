package g;

import org.telegram.messenger.MediaDataController;
public final class x {
    public long f7045a;
    public boolean f7046b;

    public void a(long j10) {
        this.f7045a = MediaDataController.calcHash(this.f7045a, j10);
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

    public void c(float f10) {
        a(Float.floatToIntBits(f10));
    }
}
