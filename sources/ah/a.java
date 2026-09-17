package ah;

import org.telegram.messenger.MediaDataController;
public final class a {
    public boolean f417a;
    public long f418b;

    public void a(long j3) {
        this.f418b = MediaDataController.calcHash(this.f418b, j3);
    }

    public void b(boolean z10) {
        long j3;
        if (z10) {
            j3 = 1;
        } else {
            j3 = 0;
        }
        a(j3);
    }

    public void c(float f7) {
        a(Float.floatToIntBits(f7));
    }
}
