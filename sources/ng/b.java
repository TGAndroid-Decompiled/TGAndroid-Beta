package ng;

import org.telegram.ui.eo;
import org.telegram.ui.hg1;
public final class b implements Runnable {
    public final int f16604a;
    public final eo f16605b;

    public b(eo eoVar, int i10) {
        this.f16604a = i10;
        this.f16605b = eoVar;
    }

    @Override
    public final void run() {
        switch (this.f16604a) {
            case 0:
                eo eoVar = this.f16605b;
                if (eoVar.getParentLayout() != null) {
                    hg1.I0(eoVar);
                    return;
                }
                return;
            default:
                this.f16605b.cc();
                return;
        }
    }
}
