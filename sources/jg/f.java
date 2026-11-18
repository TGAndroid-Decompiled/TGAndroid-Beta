package jg;

import org.telegram.ui.bx;
public final class f implements Runnable {
    public final int f17454a;
    public final m f17455b;

    public f(m mVar, int i7) {
        this.f17454a = i7;
        this.f17455b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17454a) {
            case 0:
                for (bx bxVar : this.f17455b.S.f46683f0) {
                    ((v4.c0) bxVar.f46307a.getLayoutManager()).f59080u = false;
                }
                return;
            default:
                this.f17455b.K();
                return;
        }
    }
}
