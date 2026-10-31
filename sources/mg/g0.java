package mg;

import org.telegram.messenger.q20;
import org.telegram.ui.LaunchActivity;
public final class g0 implements Runnable {
    public final int f13120a;
    public final q20 f13121b;

    public g0(q20 q20Var, int i10) {
        this.f13120a = i10;
        this.f13121b = q20Var;
    }

    @Override
    public final void run() {
        switch (this.f13120a) {
            case 0:
                org.telegram.messenger.i0.g3(new g0(this.f13121b, 2));
                return;
            case 1:
                this.f13121b.a(null);
                return;
            case 2:
                this.f13121b.a(null);
                return;
            default:
                this.f13121b.a(LaunchActivity.T());
                return;
        }
    }
}
