package gg;

import org.telegram.ui.py;
public final class f implements Runnable {
    public final int f9710a;
    public final m f9711b;

    public f(m mVar, int i10) {
        this.f9710a = i10;
        this.f9711b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f9710a) {
            case 0:
                for (py pyVar : this.f9711b.R.f37032e0) {
                    ((s4.c0) pyVar.f36693a.getLayoutManager()).f42953u = false;
                }
                return;
            default:
                this.f9711b.J();
                return;
        }
    }
}
