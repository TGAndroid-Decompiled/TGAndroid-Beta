package gg;

import org.telegram.ui.ty;
public final class f implements Runnable {
    public final int f9728a;
    public final m f9729b;

    public f(m mVar, int i10) {
        this.f9728a = i10;
        this.f9729b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f9728a) {
            case 0:
                for (ty tyVar : this.f9729b.R.f38149e0) {
                    ((s4.c0) tyVar.f37826a.getLayoutManager()).f42923u = false;
                }
                return;
            default:
                this.f9729b.J();
                return;
        }
    }
}
