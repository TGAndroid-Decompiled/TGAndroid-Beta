package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cc0;
public final class j0 implements Runnable {
    public final int f603a;
    public final u0 f604b;

    public j0(u0 u0Var, int i10) {
        this.f603a = i10;
        this.f604b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f603a) {
            case 0:
                this.f604b.f697a.invalidate();
                return;
            default:
                u0 u0Var = this.f604b;
                w wVar = u0Var.f699c;
                if (wVar.getParent() != null) {
                    if (u0Var.d) {
                        AndroidUtilities.removeFromParent(wVar);
                    } else {
                        try {
                            u0Var.f698b.removeView(wVar);
                        } catch (Exception unused) {
                        }
                    }
                    cc0 cc0Var = u0Var.f710p;
                    if (cc0Var != null) {
                        cc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
