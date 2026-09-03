package ng;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ec0;
public final class x implements Runnable {
    public final int f16239a;
    public final d0 f16240b;

    public x(d0 d0Var, int i10) {
        this.f16239a = i10;
        this.f16240b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f16239a) {
            case 0:
                this.f16240b.f16035a.invalidate();
                return;
            default:
                d0 d0Var = this.f16240b;
                ag.l lVar = d0Var.f16037c;
                if (lVar.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(lVar);
                    } else {
                        try {
                            d0Var.f16036b.removeView(lVar);
                        } catch (Exception unused) {
                        }
                    }
                    ec0 ec0Var = d0Var.f16048p;
                    if (ec0Var != null) {
                        ec0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
