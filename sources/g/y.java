package g;

import org.telegram.messenger.vi;
public final class y {
    public long f7258a;
    public boolean f7259b;

    public void a(long j10) {
        this.f7258a = vi.p(this.f7258a, j10);
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
