package hg;

import org.telegram.ui.ay;
public final class f implements Runnable {
    public final int f11857a;
    public final m f11858b;

    public f(m mVar, int i10) {
        this.f11857a = i10;
        this.f11858b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f11857a) {
            case 0:
                for (ay ayVar : this.f11858b.R.f36096e0) {
                    ((s4.b0) ayVar.f35447a.getLayoutManager()).f45915u = false;
                }
                return;
            default:
                this.f11858b.J();
                return;
        }
    }
}
