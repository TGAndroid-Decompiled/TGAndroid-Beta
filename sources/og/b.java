package og;

import org.telegram.ui.sn;
import org.telegram.ui.te1;
public final class b implements Runnable {
    public final int f17737a;
    public final sn f17738b;

    public b(sn snVar, int i10) {
        this.f17737a = i10;
        this.f17738b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f17737a) {
            case 0:
                sn snVar = this.f17738b;
                if (snVar.getParentLayout() != null) {
                    te1.I0(snVar);
                    return;
                }
                return;
            default:
                this.f17738b.cc();
                return;
        }
    }
}
