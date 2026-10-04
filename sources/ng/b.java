package ng;

import org.telegram.ui.yf1;
import org.telegram.ui.yn;
public final class b implements Runnable {
    public final int f16894a;
    public final yn f16895b;

    public b(yn ynVar, int i10) {
        this.f16894a = i10;
        this.f16895b = ynVar;
    }

    @Override
    public final void run() {
        switch (this.f16894a) {
            case 0:
                yn ynVar = this.f16895b;
                if (ynVar.getParentLayout() != null) {
                    yf1.I0(ynVar);
                    return;
                }
                return;
            default:
                this.f16895b.Xb();
                return;
        }
    }
}
