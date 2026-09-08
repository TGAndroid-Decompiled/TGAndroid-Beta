package hg;

import org.telegram.ui.ty;
public final class f implements Runnable {
    public final int f11059a;
    public final m f11060b;

    public f(m mVar, int i10) {
        this.f11059a = i10;
        this.f11060b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11059a) {
            case 0:
                for (ty tyVar : this.f11060b.R.f41286e0) {
                    ((s4.c0) tyVar.f40885a.getLayoutManager()).f45760u = false;
                }
                return;
            default:
                this.f11060b.J();
                return;
        }
    }
}
