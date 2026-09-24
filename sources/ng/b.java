package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.wn;
public final class b implements Runnable {
    public final int f15437a;
    public final wn f15438b;

    public b(wn wnVar, int i10) {
        this.f15437a = i10;
        this.f15438b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f15437a) {
            case 0:
                wn wnVar = this.f15438b;
                if (wnVar.getParentLayout() != null) {
                    wf1.I0(wnVar);
                    return;
                }
                return;
            default:
                this.f15438b.Yb();
                return;
        }
    }
}
