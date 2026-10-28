package ig;

import org.telegram.ui.dy;
public final class f implements Runnable {
    public final int f14048a;
    public final n f14049b;

    public f(n nVar, int i10) {
        this.f14048a = i10;
        this.f14049b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f14048a) {
            case 0:
                for (dy dyVar : this.f14049b.R.f38998e0) {
                    ((s4.c0) dyVar.f38702a.getLayoutManager()).f47749u = false;
                }
                return;
            default:
                this.f14049b.K();
                return;
        }
    }
}
