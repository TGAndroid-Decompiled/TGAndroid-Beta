package g;

import org.telegram.messenger.MediaDataController;
public final class z {
    public long f8455a;
    public boolean f8456b;

    public void a(long j3) {
        this.f8455a = MediaDataController.calcHash(this.f8455a, j3);
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
