package bi;

import org.telegram.ui.bn;
import org.telegram.ui.y91;
public final class i implements Runnable {
    public final int f3716a;
    public final bn f3717b;

    public i(bn bnVar, int i7) {
        this.f3716a = i7;
        this.f3717b = bnVar;
    }

    @Override
    public final void run() {
        switch (this.f3716a) {
            case 0:
                this.f3717b.Fc();
                return;
            default:
                bn bnVar = this.f3717b;
                if (bnVar.getParentLayout() != null) {
                    y91.M0(bnVar);
                    return;
                }
                return;
        }
    }
}
