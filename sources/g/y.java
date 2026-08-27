package g;

import org.telegram.messenger.MediaDataController;

public final class y {

    public long f6326a;

    public boolean f6327b;

    public void a(long j10) {
        this.f6326a = MediaDataController.calcHash(this.f6326a, j10);
    }

    public void b(boolean z10) {
        a(z10 ? 1L : 0L);
    }

    public void c(float f10) {
        a(Float.floatToIntBits(f10));
    }
}
