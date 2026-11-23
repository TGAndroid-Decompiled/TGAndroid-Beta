package dh;

import org.telegram.messenger.si;
public final class a {
    public boolean f8364a;
    public long f8365b;

    public void a(long j3) {
        this.f8365b = si.r(this.f8365b, j3);
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

    public void c(float f10) {
        a(Float.floatToIntBits(f10));
    }
}
