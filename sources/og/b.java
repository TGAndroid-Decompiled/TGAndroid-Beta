package og;

import org.telegram.ui.qn;
import org.telegram.ui.re1;
public final class b implements Runnable {
    public final int f17740a;
    public final qn f17741b;

    public b(qn qnVar, int i10) {
        this.f17740a = i10;
        this.f17741b = qnVar;
    }

    @Override
    public final void run() {
        switch (this.f17740a) {
            case 0:
                qn qnVar = this.f17741b;
                if (qnVar.getParentLayout() != null) {
                    re1.I0(qnVar);
                    return;
                }
                return;
            default:
                this.f17741b.cc();
                return;
        }
    }
}
