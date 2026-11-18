package bi;

import org.telegram.ui.bn;
import org.telegram.ui.y91;
public final class i implements Runnable {
    public final int f3680a;
    public final bn f3681b;

    public i(bn bnVar, int i7) {
        this.f3680a = i7;
        this.f3681b = bnVar;
    }

    @Override
    public final void run() {
        switch (this.f3680a) {
            case 0:
                this.f3681b.Fc();
                return;
            default:
                bn bnVar = this.f3681b;
                if (bnVar.getParentLayout() != null) {
                    y91.M0(bnVar);
                    return;
                }
                return;
        }
    }
}
