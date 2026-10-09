package ng;

import org.telegram.ui.fg1;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f16852a;
    public final zn f16853b;

    public b(zn znVar, int i10) {
        this.f16852a = i10;
        this.f16853b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f16852a) {
            case 0:
                zn znVar = this.f16853b;
                if (znVar.getParentLayout() != null) {
                    fg1.I0(znVar);
                    return;
                }
                return;
            default:
                this.f16853b.cc();
                return;
        }
    }
}
