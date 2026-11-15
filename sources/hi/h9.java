package hi;

import org.telegram.messenger.z10;
import org.telegram.ui.LaunchActivity;
public final class h9 implements Runnable {
    public final int f14385a;
    public final z10 f14386b;

    public h9(z10 z10Var, int i7) {
        this.f14385a = i7;
        this.f14386b = z10Var;
    }

    @Override
    public final void run() {
        switch (this.f14385a) {
            case 0:
                this.f14386b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.h3(new h9(this.f14386b, 3));
                return;
            case 2:
                this.f14386b.a(null);
                return;
            default:
                this.f14386b.a(null);
                return;
        }
    }
}
