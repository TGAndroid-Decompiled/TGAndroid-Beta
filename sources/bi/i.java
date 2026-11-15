package bi;

import org.telegram.ui.an;
import org.telegram.ui.u91;
public final class i implements Runnable {
    public final int f3568a;
    public final an f3569b;

    public i(an anVar, int i7) {
        this.f3568a = i7;
        this.f3569b = anVar;
    }

    @Override
    public final void run() {
        switch (this.f3568a) {
            case 0:
                this.f3569b.Fc();
                return;
            default:
                an anVar = this.f3569b;
                if (anVar.getParentLayout() != null) {
                    u91.M0(anVar);
                    return;
                }
                return;
        }
    }
}
