package m;

import androidx.appcompat.widget.Toolbar;
public final class f3 implements Runnable {
    public final int f14169a;
    public final Toolbar f14170b;

    public f3(Toolbar toolbar, int i10) {
        this.f14169a = i10;
        this.f14170b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f14169a) {
            case 0:
                h3 h3Var = this.f14170b.f2027e0;
                if (h3Var == null) {
                    mVar = null;
                } else {
                    mVar = h3Var.f14195b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14170b.m();
                return;
        }
    }
}
