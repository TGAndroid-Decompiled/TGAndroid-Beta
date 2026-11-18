package hi;

import org.telegram.messenger.x10;
import org.telegram.ui.LaunchActivity;
public final class i9 implements Runnable {
    public final int f14772a;
    public final x10 f14773b;

    public i9(x10 x10Var, int i7) {
        this.f14772a = i7;
        this.f14773b = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f14772a) {
            case 0:
                this.f14773b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.g3(new i9(this.f14773b, 3));
                return;
            case 2:
                this.f14773b.a(null);
                return;
            default:
                this.f14773b.a(null);
                return;
        }
    }
}
