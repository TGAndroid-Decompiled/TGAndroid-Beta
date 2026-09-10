package m;

import androidx.appcompat.widget.Toolbar;
public final class f3 implements Runnable {
    public final int f13005a;
    public final Toolbar f13006b;

    public f3(Toolbar toolbar, int i10) {
        this.f13005a = i10;
        this.f13006b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f13005a) {
            case 0:
                i3 i3Var = this.f13006b.f717e0;
                if (i3Var == null) {
                    nVar = null;
                } else {
                    nVar = i3Var.f13038b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f13006b.m();
                return;
        }
    }
}
