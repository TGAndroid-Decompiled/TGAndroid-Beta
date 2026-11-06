package jg;

import org.telegram.ui.vw;
public final class f implements Runnable {
    public final int f16720a;
    public final n f16721b;

    public f(n nVar, int i7) {
        this.f16720a = i7;
        this.f16721b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f16720a) {
            case 0:
                for (vw vwVar : this.f16721b.R.f51549e0) {
                    ((v4.b0) vwVar.f50838a.getLayoutManager()).f56926u = false;
                }
                return;
            default:
                this.f16721b.K();
                return;
        }
    }
}
