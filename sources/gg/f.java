package gg;

import org.telegram.ui.uy;
public final class f implements Runnable {
    public final int f10588a;
    public final m f10589b;

    public f(m mVar, int i10) {
        this.f10588a = i10;
        this.f10589b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10588a) {
            case 0:
                for (uy uyVar : this.f10589b.R.f42905e0) {
                    ((s4.d0) uyVar.f42613a.getLayoutManager()).f47891u = false;
                }
                return;
            default:
                this.f10589b.J();
                return;
        }
    }
}
