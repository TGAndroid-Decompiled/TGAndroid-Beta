package ag;

import org.telegram.ui.sf1;
import org.telegram.ui.zn;
public final class c implements Runnable {
    public final int f195a;
    public final zn f196b;

    public c(zn znVar, int i10) {
        this.f195a = i10;
        this.f196b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f195a) {
            case 0:
                zn znVar = this.f196b;
                if (znVar.getParentLayout() != null) {
                    sf1.I0(znVar);
                    return;
                }
                return;
            default:
                this.f196b.Yb();
                return;
        }
    }
}
