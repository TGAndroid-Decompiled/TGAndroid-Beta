package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.wn;
public final class b implements Runnable {
    public final int f15468a;
    public final wn f15469b;

    public b(wn wnVar, int i10) {
        this.f15468a = i10;
        this.f15469b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f15468a) {
            case 0:
                wn wnVar = this.f15469b;
                if (wnVar.getParentLayout() != null) {
                    wf1.I0(wnVar);
                    return;
                }
                return;
            default:
                this.f15469b.Yb();
                return;
        }
    }
}
