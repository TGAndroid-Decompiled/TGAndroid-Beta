package jg;

import org.telegram.ui.xw;
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
                for (xw xwVar : this.f16724b.R.f52231e0) {
                    ((v4.b0) xwVar.f51772a.getLayoutManager()).f57031u = false;
                }
                return;
            default:
                this.f16724b.K();
                return;
        }
    }
}
