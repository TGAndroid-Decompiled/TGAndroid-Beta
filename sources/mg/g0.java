package mg;

import org.telegram.messenger.r20;
import org.telegram.ui.LaunchActivity;
public final class g0 implements Runnable {
    public final int f13121a;
    public final r20 f13122b;

    public g0(r20 r20Var, int i10) {
        this.f13121a = i10;
        this.f13122b = r20Var;
    }

    @Override
    public final void run() {
        switch (this.f13121a) {
            case 0:
                org.telegram.messenger.i0.g3(new g0(this.f13122b, 2));
                return;
            case 1:
                this.f13122b.a(null);
                return;
            case 2:
                this.f13122b.a(null);
                return;
            default:
                this.f13122b.a(LaunchActivity.T());
                return;
        }
    }
}
