package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yc0;
public final class i0 implements Runnable {
    public final int f778a;
    public final t0 f779b;

    public i0(t0 t0Var, int i10) {
        this.f778a = i10;
        this.f779b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f778a) {
            case 0:
                this.f779b.f868a.invalidate();
                return;
            default:
                t0 t0Var = this.f779b;
                v vVar = t0Var.f870c;
                if (vVar.getParent() != null) {
                    if (t0Var.d) {
                        AndroidUtilities.removeFromParent(vVar);
                    } else {
                        try {
                            t0Var.f869b.removeView(vVar);
                        } catch (Exception unused) {
                        }
                    }
                    yc0 yc0Var = t0Var.f880p;
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
