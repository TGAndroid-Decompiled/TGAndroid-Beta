package ng;

import org.telegram.ui.dg1;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f15409a;
    public final zn f15410b;

    public b(zn znVar, int i10) {
        this.f15409a = i10;
        this.f15410b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f15409a) {
            case 0:
                zn znVar = this.f15410b;
                if (znVar.getParentLayout() != null) {
                    dg1.I0(znVar);
                    return;
                }
                return;
            default:
                this.f15410b.Yb();
                return;
        }
    }
}
