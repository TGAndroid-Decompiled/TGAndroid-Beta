package gg;

import org.telegram.ui.ty;
public final class f implements Runnable {
    public final int f9725a;
    public final m f9726b;

    public f(m mVar, int i10) {
        this.f9725a = i10;
        this.f9726b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f9725a) {
            case 0:
                for (ty tyVar : this.f9726b.R.f38222e0) {
                    ((s4.c0) tyVar.f37752a.getLayoutManager()).f42665u = false;
                }
                return;
            default:
                this.f9726b.J();
                return;
        }
    }
}
