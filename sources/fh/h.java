package fh;

import org.telegram.ui.qn;
import org.telegram.ui.we1;
public final class h implements Runnable {
    public final int f6493a;
    public final qn f6494b;

    public h(qn qnVar, int i9) {
        this.f6493a = i9;
        this.f6494b = qnVar;
    }

    @Override
    public final void run() {
        switch (this.f6493a) {
            case 0:
                this.f6494b.Yb();
                return;
            default:
                qn qnVar = this.f6494b;
                if (qnVar.getParentLayout() != null) {
                    we1.H0(qnVar);
                    return;
                }
                return;
        }
    }
}
