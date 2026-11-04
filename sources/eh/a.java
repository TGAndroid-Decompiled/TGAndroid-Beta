package eh;

import org.telegram.messenger.li;
public final class a {
    public boolean f9978a;
    public long f9979b;

    public void a(long j10) {
        this.f9979b = li.p(this.f9979b, j10);
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
