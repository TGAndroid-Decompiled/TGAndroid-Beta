package gh;

import org.telegram.ui.rn;
import org.telegram.ui.we1;

public final class h implements Runnable {

    public final int f7276a;

    public final rn f7277b;

    public h(rn rnVar, int i10) {
        this.f7276a = i10;
        this.f7277b = rnVar;
    }

    @Override
    public final void run() {
        switch (this.f7276a) {
            case 0:
                this.f7277b.Yb();
                break;
            default:
                rn rnVar = this.f7277b;
                if (rnVar.getParentLayout() != null) {
                    we1.I0(rnVar);
                }
                break;
        }
    }
}
