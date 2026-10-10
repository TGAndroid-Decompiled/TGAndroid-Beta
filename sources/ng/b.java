package ng;

import org.telegram.ui.fg1;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f16856a;
    public final zn f16857b;

    public b(zn znVar, int i10) {
        this.f16856a = i10;
        this.f16857b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f16856a) {
            case 0:
                zn znVar = this.f16857b;
                if (znVar.getParentLayout() != null) {
                    fg1.I0(znVar);
                    return;
                }
                return;
            default:
                this.f16857b.cc();
                return;
        }
    }
}
