package hg;

import org.telegram.ui.dy;
public final class f implements Runnable {
    public final int f11858a;
    public final m f11859b;

    public f(m mVar, int i10) {
        this.f11858a = i10;
        this.f11859b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11858a) {
            case 0:
                for (dy dyVar : this.f11859b.R.f36637e0) {
                    ((s4.b0) dyVar.f36300a.getLayoutManager()).f45904u = false;
                }
                return;
            default:
                this.f11859b.J();
                return;
        }
    }
}
