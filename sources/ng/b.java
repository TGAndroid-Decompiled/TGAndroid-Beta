package ng;

import org.telegram.ui.eg1;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f16901a;
    public final zn f16902b;

    public b(zn znVar, int i10) {
        this.f16901a = i10;
        this.f16902b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f16901a) {
            case 0:
                zn znVar = this.f16902b;
                if (znVar.getParentLayout() != null) {
                    eg1.I0(znVar);
                    return;
                }
                return;
            default:
                this.f16902b.cc();
                return;
        }
    }
}
