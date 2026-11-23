package hi;

import org.telegram.messenger.w10;
import org.telegram.ui.LaunchActivity;
public final class ca implements Runnable {
    public final int f14280a;
    public final w10 f14281b;

    public ca(w10 w10Var, int i7) {
        this.f14280a = i7;
        this.f14281b = w10Var;
    }

    @Override
    public final void run() {
        switch (this.f14280a) {
            case 0:
                this.f14281b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ca(this.f14281b, 3));
                return;
            case 2:
                this.f14281b.a(null);
                return;
            default:
                this.f14281b.a(null);
                return;
        }
    }
}
