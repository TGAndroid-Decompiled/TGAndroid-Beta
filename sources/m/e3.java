package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f15537a;
    public final Toolbar f15538b;

    public e3(Toolbar toolbar, int i10) {
        this.f15537a = i10;
        this.f15538b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f15537a) {
            case 0:
                g3 g3Var = this.f15538b.f1030e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f15553b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15538b.m();
                return;
        }
    }
}
