package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yc0;
public final class i0 implements Runnable {
    public final int f774a;
    public final t0 f775b;

    public i0(t0 t0Var, int i10) {
        this.f774a = i10;
        this.f775b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f774a) {
            case 0:
                this.f775b.f864a.invalidate();
                return;
            default:
                t0 t0Var = this.f775b;
                v vVar = t0Var.f866c;
                if (vVar.getParent() != null) {
                    if (t0Var.d) {
                        AndroidUtilities.removeFromParent(vVar);
                    } else {
                        try {
                            t0Var.f865b.removeView(vVar);
                        } catch (Exception unused) {
                        }
                    }
                    yc0 yc0Var = t0Var.f876p;
                    if (yc0Var != null) {
                        yc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
