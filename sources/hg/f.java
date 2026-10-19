package hg;

import org.telegram.ui.ay;
public final class f implements Runnable {
    public final int f11859a;
    public final m f11860b;

    public f(m mVar, int i10) {
        this.f11859a = i10;
        this.f11860b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11859a) {
            case 0:
                for (ay ayVar : this.f11860b.R.f36113e0) {
                    ((s4.b0) ayVar.f35452a.getLayoutManager()).f45904u = false;
                }
                return;
            default:
                this.f11860b.J();
                return;
        }
    }
}
