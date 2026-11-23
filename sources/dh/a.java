package dh;

import org.telegram.messenger.ri;
public final class a {
    public boolean f8363a;
    public long f8364b;

    public void a(long j3) {
        this.f8364b = ri.r(this.f8364b, j3);
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
