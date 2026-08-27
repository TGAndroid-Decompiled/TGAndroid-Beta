package ig;

import ag.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mb0;

public final class w implements Runnable {

    public final int f11468a;

    public final d0 f11469b;

    public w(d0 d0Var, int i10) {
        this.f11468a = i10;
        this.f11469b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f11468a) {
            case 0:
                this.f11469b.f11268a.invalidate();
                break;
            default:
                d0 d0Var = this.f11469b;
                y1 y1Var = d0Var.f11270c;
                if (y1Var.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(y1Var);
                    } else {
                        try {
                            d0Var.f11269b.removeView(y1Var);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    mb0 mb0Var = d0Var.f11281p;
                    if (mb0Var != null) {
                        mb0Var.run();
                    }
                    break;
                }
                break;
        }
    }
}
