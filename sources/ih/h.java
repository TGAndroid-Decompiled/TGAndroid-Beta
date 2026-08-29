package ih;

import org.telegram.ui.tn;
import org.telegram.ui.ze1;
public final class h implements Runnable {
    public final int f9193a;
    public final tn f9194b;

    public h(tn tnVar, int i10) {
        this.f9193a = i10;
        this.f9194b = tnVar;
    }

    @Override
    public final void run() {
        switch (this.f9193a) {
            case 0:
                this.f9194b.Yb();
                return;
            default:
                tn tnVar = this.f9194b;
                if (tnVar.getParentLayout() != null) {
                    ze1.I0(tnVar);
                    return;
                }
                return;
        }
    }
}
