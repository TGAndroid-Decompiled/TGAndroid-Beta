package hi;

import org.telegram.messenger.y10;
import org.telegram.ui.LaunchActivity;
public final class i9 implements Runnable {
    public final int f14732a;
    public final y10 f14733b;

    public i9(y10 y10Var, int i7) {
        this.f14732a = i7;
        this.f14733b = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f14732a) {
            case 0:
                this.f14733b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.g3(new i9(this.f14733b, 3));
                return;
            case 2:
                this.f14733b.a(null);
                return;
            default:
                this.f14733b.a(null);
                return;
        }
    }
}
