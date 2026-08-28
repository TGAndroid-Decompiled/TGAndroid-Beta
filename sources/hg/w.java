package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ib0;
public final class w implements Runnable {
    public final int f10772a;
    public final e0 f10773b;

    public w(e0 e0Var, int i9) {
        this.f10772a = i9;
        this.f10773b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f10772a) {
            case 0:
                this.f10773b.f10574a.invalidate();
                return;
            default:
                e0 e0Var = this.f10773b;
                fh.v vVar = e0Var.f10576c;
                if (vVar.getParent() != null) {
                    if (e0Var.d) {
                        AndroidUtilities.removeFromParent(vVar);
                    } else {
                        try {
                            e0Var.f10575b.removeView(vVar);
                        } catch (Exception unused) {
                        }
                    }
                    ib0 ib0Var = e0Var.f10587p;
                    if (ib0Var != null) {
                        ib0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
