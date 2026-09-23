package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.xn;
public final class b implements Runnable {
    public final int f15200a;
    public final xn f15201b;

    public b(xn xnVar, int i10) {
        this.f15200a = i10;
        this.f15201b = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f15200a) {
            case 0:
                xn xnVar = this.f15201b;
                if (xnVar.getParentLayout() != null) {
                    wf1.I0(xnVar);
                    return;
                }
                return;
            default:
                this.f15201b.Yb();
                return;
        }
    }
}
