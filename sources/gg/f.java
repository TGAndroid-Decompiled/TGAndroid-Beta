package gg;

import org.telegram.ui.ry;
public final class f implements Runnable {
    public final int f10589a;
    public final m f10590b;

    public f(m mVar, int i10) {
        this.f10589a = i10;
        this.f10590b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10589a) {
            case 0:
                for (ry ryVar : this.f10590b.R.f41907e0) {
                    ((s4.d0) ryVar.f41530a.getLayoutManager()).f47742u = false;
                }
                return;
            default:
                this.f10590b.J();
                return;
        }
    }
}
