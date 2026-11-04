package gi;

import org.telegram.messenger.u10;
import org.telegram.ui.LaunchActivity;
public final class k9 implements Runnable {
    public final int f13044a;
    public final u10 f13045b;

    public k9(u10 u10Var, int i3) {
        this.f13044a = i3;
        this.f13045b = u10Var;
    }

    @Override
    public final void run() {
        switch (this.f13044a) {
            case 0:
                this.f13045b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.h3(new k9(this.f13045b, 3));
                return;
            case 2:
                this.f13045b.a(null);
                return;
            default:
                this.f13045b.a(null);
                return;
        }
    }
}
