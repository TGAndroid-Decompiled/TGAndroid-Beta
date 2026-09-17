package og;

import org.telegram.ui.co;
import org.telegram.ui.eg1;
public final class b implements Runnable {
    public final int f17021a;
    public final co f17022b;

    public b(co coVar, int i10) {
        this.f17021a = i10;
        this.f17022b = coVar;
    }

    @Override
    public final void run() {
        switch (this.f17021a) {
            case 0:
                co coVar = this.f17022b;
                if (coVar.getParentLayout() != null) {
                    eg1.I0(coVar);
                    return;
                }
                return;
            default:
                this.f17022b.Yb();
                return;
        }
    }
}
