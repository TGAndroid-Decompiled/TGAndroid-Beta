package hg;

import org.telegram.ui.dy;
public final class f implements Runnable {
    public final int f11884a;
    public final m f11885b;

    public f(m mVar, int i10) {
        this.f11884a = i10;
        this.f11885b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11884a) {
            case 0:
                for (dy dyVar : this.f11885b.R.f37059e0) {
                    ((s4.b0) dyVar.f36750a.getLayoutManager()).f46337u = false;
                }
                return;
            default:
                this.f11885b.K();
                return;
        }
    }
}
