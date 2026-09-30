package gg;

import org.telegram.ui.py;
public final class f implements Runnable {
    public final int f9722a;
    public final m f9723b;

    public f(m mVar, int i10) {
        this.f9722a = i10;
        this.f9723b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f9722a) {
            case 0:
                for (py pyVar : this.f9723b.R.f37134e0) {
                    ((s4.c0) pyVar.f36794a.getLayoutManager()).f43062u = false;
                }
                return;
            default:
                this.f9723b.J();
                return;
        }
    }
}
