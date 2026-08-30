package g;

import org.telegram.messenger.MediaDataController;
public final class x {
    public long f6326a;
    public boolean f6327b;

    public void a(long j10) {
        this.f6326a = MediaDataController.calcHash(this.f6326a, j10);
    }

    public void b(boolean z4) {
        long j10;
        if (z4) {
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
