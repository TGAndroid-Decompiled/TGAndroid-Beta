package jg;

import org.telegram.ui.bx;
public final class f implements Runnable {
    public final int f17445a;
    public final m f17446b;

    public f(m mVar, int i7) {
        this.f17445a = i7;
        this.f17446b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17445a) {
            case 0:
                for (bx bxVar : this.f17446b.S.f46683f0) {
                    ((v4.b0) bxVar.f46318a.getLayoutManager()).f59070u = false;
                }
                return;
            default:
                this.f17446b.K();
                return;
        }
    }
}
