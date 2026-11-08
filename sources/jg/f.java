package jg;

import org.telegram.ui.vw;
public final class f implements Runnable {
    public final int f16723a;
    public final n f16724b;

    public f(n nVar, int i7) {
        this.f16723a = i7;
        this.f16724b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f16723a) {
            case 0:
                for (vw vwVar : this.f16724b.R.f51556e0) {
                    ((v4.b0) vwVar.f50782a.getLayoutManager()).f57019u = false;
                }
                return;
            default:
                this.f16724b.K();
                return;
        }
    }
}
