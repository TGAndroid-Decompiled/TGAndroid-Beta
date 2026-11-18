package jg;

import org.telegram.ui.bx;
public final class f implements Runnable {
    public final int f17451a;
    public final m f17452b;

    public f(m mVar, int i7) {
        this.f17451a = i7;
        this.f17452b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17451a) {
            case 0:
                for (bx bxVar : this.f17452b.S.f46663f0) {
                    ((v4.c0) bxVar.f46298a.getLayoutManager()).f59081u = false;
                }
                return;
            default:
                this.f17452b.K();
                return;
        }
    }
}
