package bi;

import org.telegram.ui.bn;
import org.telegram.ui.y91;
public final class i implements Runnable {
    public final int f3711a;
    public final bn f3712b;

    public i(bn bnVar, int i7) {
        this.f3711a = i7;
        this.f3712b = bnVar;
    }

    @Override
    public final void run() {
        switch (this.f3711a) {
            case 0:
                this.f3712b.Fc();
                return;
            default:
                bn bnVar = this.f3712b;
                if (bnVar.getParentLayout() != null) {
                    y91.M0(bnVar);
                    return;
                }
                return;
        }
    }
}
