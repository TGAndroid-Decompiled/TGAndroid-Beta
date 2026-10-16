package m;

import androidx.appcompat.widget.Toolbar;
public final class i3 implements Runnable {
    public final int f14872a;
    public final Toolbar f14873b;

    public i3(Toolbar toolbar, int i10) {
        this.f14872a = i10;
        this.f14873b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f14872a) {
            case 0:
                k3 k3Var = this.f14873b.f1179e0;
                if (k3Var == null) {
                    mVar = null;
                } else {
                    mVar = k3Var.f14887b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14873b.m();
                return;
        }
    }
}
