package ng;

import org.telegram.ui.yf1;
import org.telegram.ui.yn;
public final class b implements Runnable {
    public final int f16898a;
    public final yn f16899b;

    public b(yn ynVar, int i10) {
        this.f16898a = i10;
        this.f16899b = ynVar;
    }

    @Override
    public final void run() {
        switch (this.f16898a) {
            case 0:
                yn ynVar = this.f16899b;
                if (ynVar.getParentLayout() != null) {
                    yf1.I0(ynVar);
                    return;
                }
                return;
            default:
                this.f16899b.Xb();
                return;
        }
    }
}
