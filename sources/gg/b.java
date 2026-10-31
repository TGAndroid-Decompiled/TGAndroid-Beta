package gg;

import org.telegram.ui.pb1;
import org.telegram.ui.un;
public final class b implements Runnable {
    public final int f7500a;
    public final un f7501b;

    public b(un unVar, int i10) {
        this.f7500a = i10;
        this.f7501b = unVar;
    }

    @Override
    public final void run() {
        switch (this.f7500a) {
            case 0:
                un unVar = this.f7501b;
                if (unVar.getParentLayout() != null) {
                    pb1.L0(unVar);
                    return;
                }
                return;
            default:
                this.f7501b.rc();
                return;
        }
    }
}
