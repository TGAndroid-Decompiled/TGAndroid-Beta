package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.wn;
public final class b implements Runnable {
    public final int f15452a;
    public final wn f15453b;

    public b(wn wnVar, int i10) {
        this.f15452a = i10;
        this.f15453b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f15452a) {
            case 0:
                wn wnVar = this.f15453b;
                if (wnVar.getParentLayout() != null) {
                    wf1.I0(wnVar);
                    return;
                }
                return;
            default:
                this.f15453b.Yb();
                return;
        }
    }
}
