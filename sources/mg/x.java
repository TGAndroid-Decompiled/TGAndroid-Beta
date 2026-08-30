package mg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cc0;
public final class x implements Runnable {
    public final int f14163a;
    public final d0 f14164b;

    public x(d0 d0Var, int i10) {
        this.f14163a = i10;
        this.f14164b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f14163a) {
            case 0:
                this.f14164b.f13972a.invalidate();
                return;
            default:
                d0 d0Var = this.f14164b;
                ah.d dVar = d0Var.f13974c;
                if (dVar.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(dVar);
                    } else {
                        try {
                            d0Var.f13973b.removeView(dVar);
                        } catch (Exception unused) {
                        }
                    }
                    cc0 cc0Var = d0Var.f13984p;
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
