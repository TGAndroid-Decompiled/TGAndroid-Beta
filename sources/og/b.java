package og;

import org.telegram.ui.sn;
import org.telegram.ui.te1;
public final class b implements Runnable {
    public final int f17741a;
    public final sn f17742b;

    public b(sn snVar, int i10) {
        this.f17741a = i10;
        this.f17742b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f17741a) {
            case 0:
                sn snVar = this.f17742b;
                if (snVar.getParentLayout() != null) {
                    te1.I0(snVar);
                    return;
                }
                return;
            default:
                this.f17742b.cc();
                return;
        }
    }
}
