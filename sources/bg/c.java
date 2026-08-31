package bg;

import org.telegram.ui.mf1;
import org.telegram.ui.xn;
public final class c implements Runnable {
    public final int f1975a;
    public final xn f1976b;

    public c(xn xnVar, int i10) {
        this.f1975a = i10;
        this.f1976b = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f1975a) {
            case 0:
                xn xnVar = this.f1976b;
                if (xnVar.getParentLayout() != null) {
                    mf1.I0(xnVar);
                    return;
                }
                return;
            default:
                this.f1976b.Yb();
                return;
        }
    }
}
