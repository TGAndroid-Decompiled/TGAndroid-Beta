package bi;

import org.telegram.ui.bn;
import org.telegram.ui.w91;
public final class i implements Runnable {
    public final int f3652a;
    public final bn f3653b;

    public i(bn bnVar, int i7) {
        this.f3652a = i7;
        this.f3653b = bnVar;
    }

    @Override
    public final void run() {
        switch (this.f3652a) {
            case 0:
                this.f3653b.Fc();
                return;
            default:
                bn bnVar = this.f3653b;
                if (bnVar.getParentLayout() != null) {
                    w91.M0(bnVar);
                    return;
                }
                return;
        }
    }
}
