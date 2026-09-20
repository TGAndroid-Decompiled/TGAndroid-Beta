package gg;

import org.telegram.ui.ty;
public final class f implements Runnable {
    public final int f9729a;
    public final m f9730b;

    public f(m mVar, int i10) {
        this.f9729a = i10;
        this.f9730b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f9729a) {
            case 0:
                for (ty tyVar : this.f9730b.R.f38256e0) {
                    ((s4.c0) tyVar.f37904a.getLayoutManager()).f42968u = false;
                }
                return;
            default:
                this.f9730b.J();
                return;
        }
    }
}
