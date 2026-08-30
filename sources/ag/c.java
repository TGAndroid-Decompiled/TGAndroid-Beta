package ag;

import org.telegram.ui.kf1;
import org.telegram.ui.xn;
public final class c implements Runnable {
    public final int f183a;
    public final xn f184b;

    public c(xn xnVar, int i10) {
        this.f183a = i10;
        this.f184b = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f183a) {
            case 0:
                xn xnVar = this.f184b;
                if (xnVar.getParentLayout() != null) {
                    kf1.I0(xnVar);
                    return;
                }
                return;
            default:
                this.f184b.Yb();
                return;
        }
    }
}
