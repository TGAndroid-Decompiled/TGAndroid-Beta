package bh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wa0;
public final class y implements Runnable {
    public final int f4210a;
    public final i0 f4211b;

    public y(i0 i0Var, int i10) {
        this.f4210a = i10;
        this.f4211b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f4210a) {
            case 0:
                this.f4211b.f4047a.invalidate();
                return;
            default:
                i0 i0Var = this.f4211b;
                p pVar = i0Var.f4049c;
                if (pVar.getParent() != null) {
                    if (i0Var.d) {
                        AndroidUtilities.removeFromParent(pVar);
                    } else {
                        try {
                            i0Var.f4048b.removeView(pVar);
                        } catch (Exception unused) {
                        }
                    }
                    wa0 wa0Var = i0Var.f4059p;
                    if (wa0Var != null) {
                        wa0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
