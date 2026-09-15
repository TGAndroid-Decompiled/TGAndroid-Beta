package gg;

import org.telegram.ui.ty;
public final class f implements Runnable {
    public final int f9724a;
    public final m f9725b;

    public f(m mVar, int i10) {
        this.f9724a = i10;
        this.f9725b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f9724a) {
            case 0:
                for (ty tyVar : this.f9725b.R.f38207e0) {
                    ((s4.c0) tyVar.f37803a.getLayoutManager()).f42669u = false;
                }
                return;
            default:
                this.f9725b.J();
                return;
        }
    }
}
