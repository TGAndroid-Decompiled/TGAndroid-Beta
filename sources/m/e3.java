package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f12404a;
    public final Toolbar f12405b;

    public e3(Toolbar toolbar, int i10) {
        this.f12404a = i10;
        this.f12405b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f12404a) {
            case 0:
                g3 g3Var = this.f12405b.f1079e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f12419b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f12405b.m();
                return;
        }
    }
}
