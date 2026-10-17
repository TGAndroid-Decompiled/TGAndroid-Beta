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
                for (dy dyVar : this.f11859b.R.f36630e0) {
                    ((s4.b0) dyVar.f36333a.getLayoutManager()).f45932u = false;
                }
                return;
            default:
                this.f11859b.J();
                return;
        }
    }
}
