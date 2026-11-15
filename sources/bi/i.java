package bi;

import org.telegram.ui.an;
import org.telegram.ui.u91;
public final class i implements Runnable {
    public final int f3571a;
    public final an f3572b;

    public i(an anVar, int i7) {
        this.f3571a = i7;
        this.f3572b = anVar;
    }

    @Override
    public final void run() {
        switch (this.f3571a) {
            case 0:
                this.f3572b.Fc();
                return;
            default:
                an anVar = this.f3572b;
                if (anVar.getParentLayout() != null) {
                    u91.M0(anVar);
                    return;
                }
                return;
        }
    }
}
