package gg;

import org.telegram.ui.ty;
public final class f implements Runnable {
    public final int f10573a;
    public final m f10574b;

    public f(m mVar, int i10) {
        this.f10573a = i10;
        this.f10574b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10573a) {
            case 0:
                for (ty tyVar : this.f10574b.R.f41400e0) {
                    ((s4.c0) tyVar.f40990a.getLayoutManager()).f46525u = false;
                }
                return;
            default:
                this.f10574b.J();
                return;
        }
    }
}
