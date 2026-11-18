package dh;

import org.telegram.messenger.ri;
public final class a {
    public boolean f8369a;
    public long f8370b;

    public void a(long j3) {
        this.f8370b = ri.r(this.f8370b, j3);
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
