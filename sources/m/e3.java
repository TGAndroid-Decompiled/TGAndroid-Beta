package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14435a;
    public final Toolbar f14436b;

    public e3(Toolbar toolbar, int i10) {
        this.f14435a = i10;
        this.f14436b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f14435a) {
            case 0:
                g3 g3Var = this.f14436b.f2026e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f14450b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14436b.m();
                return;
        }
    }
}
