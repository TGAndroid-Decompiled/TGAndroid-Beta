package og;

import org.telegram.ui.sn;
import org.telegram.ui.te1;
public final class b implements Runnable {
    public final int f17734a;
    public final sn f17735b;

    public b(sn snVar, int i10) {
        this.f17734a = i10;
        this.f17735b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f17734a) {
            case 0:
                sn snVar = this.f17735b;
                if (snVar.getParentLayout() != null) {
                    te1.I0(snVar);
                    return;
                }
                return;
            default:
                this.f17735b.cc();
                return;
        }
    }
}
