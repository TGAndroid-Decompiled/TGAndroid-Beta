package g;

import org.telegram.messenger.MediaDataController;
public final class x {
    public long f6799a;
    public boolean f6800b;

    public void a(long j10) {
        this.f6799a = MediaDataController.calcHash(this.f6799a, j10);
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
