package gg;

import org.telegram.ui.nb1;
import org.telegram.ui.un;
public final class b implements Runnable {
    public final int f7501a;
    public final un f7502b;

    public b(un unVar, int i10) {
        this.f7501a = i10;
        this.f7502b = unVar;
    }

    @Override
    public final void run() {
        switch (this.f7501a) {
            case 0:
                un unVar = this.f7502b;
                if (unVar.getParentLayout() != null) {
                    nb1.M0(unVar);
                    return;
                }
                return;
            default:
                this.f7502b.wc();
                return;
        }
    }
}
