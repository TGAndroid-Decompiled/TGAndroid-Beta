package hg;

import org.telegram.ui.ty;
public final class f implements Runnable {
    public final int f11033a;
    public final m f11034b;

    public f(m mVar, int i10) {
        this.f11033a = i10;
        this.f11034b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11033a) {
            case 0:
                for (ty tyVar : this.f11034b.R.f41260e0) {
                    ((s4.c0) tyVar.f40859a.getLayoutManager()).f45733u = false;
                }
                return;
            default:
                this.f11034b.J();
                return;
        }
    }
}
