package ng;

import org.telegram.ui.fg1;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f15444a;
    public final zn f15445b;

    public b(zn znVar, int i10) {
        this.f15444a = i10;
        this.f15445b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f15444a) {
            case 0:
                zn znVar = this.f15445b;
                if (znVar.getParentLayout() != null) {
                    fg1.I0(znVar);
                    return;
                }
                return;
            default:
                this.f15445b.Yb();
                return;
        }
    }
}
