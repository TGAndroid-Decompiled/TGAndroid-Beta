package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14388a;
    public final Toolbar f14389b;

    public e3(Toolbar toolbar, int i10) {
        this.f14388a = i10;
        this.f14389b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f14388a) {
            case 0:
                g3 g3Var = this.f14389b.f2032e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f14403b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14389b.m();
                return;
        }
    }
}
