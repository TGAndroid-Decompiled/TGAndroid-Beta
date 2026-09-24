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
                for (py pyVar : this.f9711b.R.f37021e0) {
                    ((s4.c0) pyVar.f36679a.getLayoutManager()).f42940u = false;
                }
                return;
            default:
                this.f9711b.J();
                return;
        }
    }
}
