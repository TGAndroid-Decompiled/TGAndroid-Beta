package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14408a;
    public final Toolbar f14409b;

    public e3(Toolbar toolbar, int i10) {
        this.f14408a = i10;
        this.f14409b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f14408a) {
            case 0:
                g3 g3Var = this.f14409b.f2024e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f14423b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14409b.m();
                return;
        }
    }
}
