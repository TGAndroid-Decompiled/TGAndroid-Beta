package mg;

import org.telegram.ui.eo;
import org.telegram.ui.ig1;
public final class b implements Runnable {
    public final int f13654a;
    public final eo f13655b;

    public b(eo eoVar, int i10) {
        this.f13654a = i10;
        this.f13655b = eoVar;
    }

    @Override
    public final void run() {
        switch (this.f13654a) {
            case 0:
                eo eoVar = this.f13655b;
                if (eoVar.getParentLayout() != null) {
                    ig1.I0(eoVar);
                    return;
                }
                return;
            default:
                this.f13655b.Yb();
                return;
        }
    }
}
