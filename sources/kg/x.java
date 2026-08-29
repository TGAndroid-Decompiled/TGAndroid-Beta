package kg;

import bg.d1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xb0;
public final class x implements Runnable {
    public final int f13884a;
    public final d0 f13885b;

    public x(d0 d0Var, int i10) {
        this.f13884a = i10;
        this.f13885b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f13884a) {
            case 0:
                this.f13885b.f13681a.invalidate();
                return;
            default:
                d0 d0Var = this.f13885b;
                d1 d1Var = d0Var.f13683c;
                if (d1Var.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(d1Var);
                    } else {
                        try {
                            d0Var.f13682b.removeView(d1Var);
                        } catch (Exception unused) {
                        }
                    }
                    xb0 xb0Var = d0Var.f13694p;
                    if (xb0Var != null) {
                        xb0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
