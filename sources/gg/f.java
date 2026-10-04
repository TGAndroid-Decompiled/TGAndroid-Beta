package gg;

import org.telegram.ui.ty;
public final class f implements Runnable {
    public final int f10572a;
    public final m f10573b;

    public f(m mVar, int i10) {
        this.f10572a = i10;
        this.f10573b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10572a) {
            case 0:
                for (ty tyVar : this.f10573b.R.f41392e0) {
                    ((s4.c0) tyVar.f40983a.getLayoutManager()).f46517u = false;
                }
                return;
            default:
                this.f10573b.J();
                return;
        }
    }
}
