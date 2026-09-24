package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14393a;
    public final Toolbar f14394b;

    public e3(Toolbar toolbar, int i10) {
        this.f14393a = i10;
        this.f14394b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f14393a) {
            case 0:
                g3 g3Var = this.f14394b.f2024e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f14408b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14394b.m();
                return;
        }
    }
}
