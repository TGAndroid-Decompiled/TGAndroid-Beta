package ng;

import org.telegram.ui.fg1;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f15457a;
    public final zn f15458b;

    public b(zn znVar, int i10) {
        this.f15457a = i10;
        this.f15458b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f15457a) {
            case 0:
                zn znVar = this.f15458b;
                if (znVar.getParentLayout() != null) {
                    fg1.I0(znVar);
                    return;
                }
                return;
            default:
                this.f15458b.Yb();
                return;
        }
    }
}
