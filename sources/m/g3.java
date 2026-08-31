package m;

import androidx.appcompat.widget.Toolbar;
public final class g3 implements Runnable {
    public final int f13198a;
    public final Toolbar f13199b;

    public g3(Toolbar toolbar, int i10) {
        this.f13198a = i10;
        this.f13199b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f13198a) {
            case 0:
                i3 i3Var = this.f13199b.f483b0;
                if (i3Var == null) {
                    nVar = null;
                } else {
                    nVar = i3Var.f13220b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f13199b.m();
                return;
        }
    }
}
