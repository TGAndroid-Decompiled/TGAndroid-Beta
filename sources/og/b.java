package og;

import org.telegram.ui.qn;
import org.telegram.ui.re1;
public final class b implements Runnable {
    public final int f17738a;
    public final qn f17739b;

    public b(qn qnVar, int i10) {
        this.f17738a = i10;
        this.f17739b = qnVar;
    }

    @Override
    public final void run() {
        switch (this.f17738a) {
            case 0:
                qn qnVar = this.f17739b;
                if (qnVar.getParentLayout() != null) {
                    re1.I0(qnVar);
                    return;
                }
                return;
            default:
                this.f17739b.dc();
                return;
        }
    }
}
