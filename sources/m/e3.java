package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14409a;
    public final Toolbar f14410b;

    public e3(Toolbar toolbar, int i10) {
        this.f14409a = i10;
        this.f14410b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f14409a) {
            case 0:
                g3 g3Var = this.f14410b.f2024e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f14424b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14410b.m();
                return;
        }
    }
}
