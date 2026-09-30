package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14424a;
    public final Toolbar f14425b;

    public e3(Toolbar toolbar, int i10) {
        this.f14424a = i10;
        this.f14425b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f14424a) {
            case 0:
                g3 g3Var = this.f14425b.f2031e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f14439b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14425b.m();
                return;
        }
    }
}
