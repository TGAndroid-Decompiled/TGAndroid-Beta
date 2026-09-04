package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cc0;
public final class j0 implements Runnable {
    public final int f591a;
    public final u0 f592b;

    public j0(u0 u0Var, int i10) {
        this.f591a = i10;
        this.f592b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f591a) {
            case 0:
                this.f592b.f685a.invalidate();
                return;
            default:
                u0 u0Var = this.f592b;
                w wVar = u0Var.f687c;
                if (wVar.getParent() != null) {
                    if (u0Var.d) {
                        AndroidUtilities.removeFromParent(wVar);
                    } else {
                        try {
                            u0Var.f686b.removeView(wVar);
                        } catch (Exception unused) {
                        }
                    }
                    cc0 cc0Var = u0Var.f698p;
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
