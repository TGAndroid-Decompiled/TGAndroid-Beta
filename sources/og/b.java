package og;

import org.telegram.ui.co;
import org.telegram.ui.eg1;
public final class b implements Runnable {
    public final int f17048a;
    public final co f17049b;

    public b(co coVar, int i10) {
        this.f17048a = i10;
        this.f17049b = coVar;
    }

    @Override
    public final void run() {
        switch (this.f17048a) {
            case 0:
                co coVar = this.f17049b;
                if (coVar.getParentLayout() != null) {
                    eg1.I0(coVar);
                    return;
                }
                return;
            default:
                this.f17049b.Yb();
                return;
        }
    }
}
