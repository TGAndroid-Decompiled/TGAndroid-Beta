package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yb0;
public final class i0 implements Runnable {
    public final int f779a;
    public final t0 f780b;

    public i0(t0 t0Var, int i10) {
        this.f779a = i10;
        this.f780b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f779a) {
            case 0:
                this.f780b.f869a.invalidate();
                return;
            default:
                t0 t0Var = this.f780b;
                v vVar = t0Var.f871c;
                if (vVar.getParent() != null) {
                    if (t0Var.d) {
                        AndroidUtilities.removeFromParent(vVar);
                    } else {
                        try {
                            t0Var.f870b.removeView(vVar);
                        } catch (Exception unused) {
                        }
                    }
                    yb0 yb0Var = t0Var.f881p;
                    if (yb0Var != null) {
                        yb0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
