package hg;

import org.telegram.ui.dy;
public final class f implements Runnable {
    public final int f11860a;
    public final m f11861b;

    public f(m mVar, int i10) {
        this.f11860a = i10;
        this.f11861b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11860a) {
            case 0:
                for (dy dyVar : this.f11861b.R.f36653e0) {
                    ((s4.b0) dyVar.f36337a.getLayoutManager()).f45952u = false;
                }
                return;
            default:
                this.f11861b.J();
                return;
        }
    }
}
