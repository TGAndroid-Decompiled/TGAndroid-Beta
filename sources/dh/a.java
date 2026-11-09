package dh;

import org.telegram.messenger.ui;
public final class a {
    public boolean f8698a;
    public long f8699b;

    public void a(long j3) {
        this.f8699b = ui.p(this.f8699b, j3);
    }

    public void b(boolean z9) {
        long j3;
        if (z9) {
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
