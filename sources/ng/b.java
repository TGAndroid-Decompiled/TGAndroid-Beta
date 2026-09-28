package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.wn;
public final class b implements Runnable {
    public final int f15453a;
    public final wn f15454b;

    public b(wn wnVar, int i10) {
        this.f15453a = i10;
        this.f15454b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f15453a) {
            case 0:
                wn wnVar = this.f15454b;
                if (wnVar.getParentLayout() != null) {
                    wf1.I0(wnVar);
                    return;
                }
                return;
            default:
                this.f15454b.Yb();
                return;
        }
    }
}
