package ng;

import org.telegram.ui.yf1;
import org.telegram.ui.yn;
public final class b implements Runnable {
    public final int f16893a;
    public final yn f16894b;

    public b(yn ynVar, int i10) {
        this.f16893a = i10;
        this.f16894b = ynVar;
    }

    @Override
    public final void run() {
        switch (this.f16893a) {
            case 0:
                yn ynVar = this.f16894b;
                if (ynVar.getParentLayout() != null) {
                    yf1.I0(ynVar);
                    return;
                }
                return;
            default:
                this.f16894b.Xb();
                return;
        }
    }
}
