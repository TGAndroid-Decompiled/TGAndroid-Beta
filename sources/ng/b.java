package ng;

import org.telegram.ui.eo;
import org.telegram.ui.hg1;
public final class b implements Runnable {
    public final int f16605a;
    public final eo f16606b;

    public b(eo eoVar, int i10) {
        this.f16605a = i10;
        this.f16606b = eoVar;
    }

    @Override
    public final void run() {
        switch (this.f16605a) {
            case 0:
                eo eoVar = this.f16606b;
                if (eoVar.getParentLayout() != null) {
                    hg1.I0(eoVar);
                    return;
                }
                return;
            default:
                this.f16606b.cc();
                return;
        }
    }
}
