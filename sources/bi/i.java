package bi;

import org.telegram.ui.bn;
import org.telegram.ui.y91;
public final class i implements Runnable {
    public final int f3715a;
    public final bn f3716b;

    public i(bn bnVar, int i7) {
        this.f3715a = i7;
        this.f3716b = bnVar;
    }

    @Override
    public final void run() {
        switch (this.f3715a) {
            case 0:
                this.f3716b.Fc();
                return;
            default:
                bn bnVar = this.f3716b;
                if (bnVar.getParentLayout() != null) {
                    y91.M0(bnVar);
                    return;
                }
                return;
        }
    }
}
