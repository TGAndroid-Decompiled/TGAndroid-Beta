package hi;

import org.telegram.messenger.x10;
import org.telegram.ui.LaunchActivity;
public final class i9 implements Runnable {
    public final int f14775a;
    public final x10 f14776b;

    public i9(x10 x10Var, int i7) {
        this.f14775a = i7;
        this.f14776b = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f14775a) {
            case 0:
                this.f14776b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.g3(new i9(this.f14776b, 3));
                return;
            case 2:
                this.f14776b.a(null);
                return;
            default:
                this.f14776b.a(null);
                return;
        }
    }
}
