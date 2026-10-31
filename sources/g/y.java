package g;

import org.telegram.messenger.ui;
public final class y {
    public long f7257a;
    public boolean f7258b;

    public void a(long j10) {
        this.f7257a = ui.p(this.f7257a, j10);
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
