package m;

import androidx.appcompat.widget.Toolbar;
public final class d3 implements Runnable {
    public final int f20139a;
    public final Toolbar f20140b;

    public d3(Toolbar toolbar, int i7) {
        this.f20139a = i7;
        this.f20140b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f20139a) {
            case 0:
                f3 f3Var = this.f20140b.f1897f0;
                if (f3Var == null) {
                    mVar = null;
                } else {
                    mVar = f3Var.f20147b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f20140b.m();
                return;
        }
    }
}
