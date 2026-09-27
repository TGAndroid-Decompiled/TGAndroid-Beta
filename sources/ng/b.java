package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.xn;
public final class b implements Runnable {
    public final int f15487a;
    public final xn f15488b;

    public b(xn xnVar, int i10) {
        this.f15487a = i10;
        this.f15488b = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f15487a) {
            case 0:
                xn xnVar = this.f15488b;
                if (xnVar.getParentLayout() != null) {
                    wf1.I0(xnVar);
                    return;
                }
                return;
            default:
                this.f15488b.Yb();
                return;
        }
    }
}
