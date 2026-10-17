package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rc0;
public final class i0 implements Runnable {
    public final int f780a;
    public final t0 f781b;

    public i0(t0 t0Var, int i10) {
        this.f780a = i10;
        this.f781b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f780a) {
            case 0:
                this.f781b.f870a.invalidate();
                return;
            default:
                t0 t0Var = this.f781b;
                v vVar = t0Var.f872c;
                if (vVar.getParent() != null) {
                    if (t0Var.d) {
                        AndroidUtilities.removeFromParent(vVar);
                    } else {
                        try {
                            t0Var.f871b.removeView(vVar);
                        } catch (Exception unused) {
                        }
                    }
                    rc0 rc0Var = t0Var.f882p;
                    if (rc0Var != null) {
                        rc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
