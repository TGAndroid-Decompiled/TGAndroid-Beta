package hi;

import org.telegram.messenger.y10;
import org.telegram.ui.LaunchActivity;
public final class h9 implements Runnable {
    public final int f14762a;
    public final y10 f14763b;

    public h9(y10 y10Var, int i7) {
        this.f14762a = i7;
        this.f14763b = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f14762a) {
            case 0:
                this.f14763b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.g3(new h9(this.f14763b, 3));
                return;
            case 2:
                this.f14763b.a(null);
                return;
            default:
                this.f14763b.a(null);
                return;
        }
    }
}
