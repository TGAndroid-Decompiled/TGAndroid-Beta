package ng;

import org.telegram.ui.eg1;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f16937a;
    public final zn f16938b;

    public b(zn znVar, int i10) {
        this.f16937a = i10;
        this.f16938b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f16937a) {
            case 0:
                zn znVar = this.f16938b;
                if (znVar.getParentLayout() != null) {
                    eg1.I0(znVar);
                    return;
                }
                return;
            default:
                this.f16938b.cc();
                return;
        }
    }
}
