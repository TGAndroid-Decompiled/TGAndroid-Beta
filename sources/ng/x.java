package ng;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ec0;
public final class x implements Runnable {
    public final int f16237a;
    public final d0 f16238b;

    public x(d0 d0Var, int i10) {
        this.f16237a = i10;
        this.f16238b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f16237a) {
            case 0:
                this.f16238b.f16033a.invalidate();
                return;
            default:
                d0 d0Var = this.f16238b;
                ag.l lVar = d0Var.f16035c;
                if (lVar.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(lVar);
                    } else {
                        try {
                            d0Var.f16034b.removeView(lVar);
                        } catch (Exception unused) {
                        }
                    }
                    ec0 ec0Var = d0Var.f16046p;
                    if (ec0Var != null) {
                        ec0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
