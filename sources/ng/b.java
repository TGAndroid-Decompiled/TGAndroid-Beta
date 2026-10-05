package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.yn;
public final class b implements Runnable {
    public final int f16903a;
    public final yn f16904b;

    public b(yn ynVar, int i10) {
        this.f16903a = i10;
        this.f16904b = ynVar;
    }

    @Override
    public final void run() {
        switch (this.f16903a) {
            case 0:
                yn ynVar = this.f16904b;
                if (ynVar.getParentLayout() != null) {
                    wf1.I0(ynVar);
                    return;
                }
                return;
            default:
                this.f16904b.Xb();
                return;
        }
    }
}
