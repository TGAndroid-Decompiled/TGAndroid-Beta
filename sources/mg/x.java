package mg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dc0;
public final class x implements Runnable {
    public final int f14151a;
    public final d0 f14152b;

    public x(d0 d0Var, int i10) {
        this.f14151a = i10;
        this.f14152b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f14151a) {
            case 0:
                this.f14152b.f13960a.invalidate();
                return;
            default:
                d0 d0Var = this.f14152b;
                ah.e eVar = d0Var.f13962c;
                if (eVar.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(eVar);
                    } else {
                        try {
                            d0Var.f13961b.removeView(eVar);
                        } catch (Exception unused) {
                        }
                    }
                    dc0 dc0Var = d0Var.f13972p;
                    if (dc0Var != null) {
                        dc0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
