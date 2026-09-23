package gg;

import org.telegram.ui.qy;
public final class f implements Runnable {
    public final int f9711a;
    public final m f9712b;

    public f(m mVar, int i10) {
        this.f9711a = i10;
        this.f9712b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f9711a) {
            case 0:
                for (qy qyVar : this.f9712b.R.f36978e0) {
                    ((s4.c0) qyVar.f36629a.getLayoutManager()).f42621u = false;
                }
                return;
            default:
                this.f9712b.J();
                return;
        }
    }
}
