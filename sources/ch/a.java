package ch;

import org.telegram.messenger.MediaDataController;
public final class a {
    public boolean f6296a;
    public long f6297b;

    public void a(long j10) {
        this.f6297b = MediaDataController.calcHash(this.f6297b, j10);
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
