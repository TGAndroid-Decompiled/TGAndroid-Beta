package hi;

import org.telegram.messenger.x10;
import org.telegram.ui.LaunchActivity;
public final class h9 implements Runnable {
    public final int f14759a;
    public final x10 f14760b;

    public h9(x10 x10Var, int i7) {
        this.f14759a = i7;
        this.f14760b = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f14759a) {
            case 0:
                this.f14760b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.g3(new h9(this.f14760b, 3));
                return;
            case 2:
                this.f14760b.a(null);
                return;
            default:
                this.f14760b.a(null);
                return;
        }
    }
}
