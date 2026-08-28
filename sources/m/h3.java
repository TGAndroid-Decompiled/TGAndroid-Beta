package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f16960a;
    public final Toolbar f16961b;

    public h3(Toolbar toolbar, int i9) {
        this.f16960a = i9;
        this.f16961b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f16960a) {
            case 0:
                k3 k3Var = this.f16961b.f513a0;
                if (k3Var == null) {
                    mVar = null;
                } else {
                    mVar = k3Var.f16991b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f16961b.m();
                return;
        }
    }
}
