package m;

import androidx.appcompat.widget.Toolbar;
public final class d3 implements Runnable {
    public final int f20073a;
    public final Toolbar f20074b;

    public d3(Toolbar toolbar, int i7) {
        this.f20073a = i7;
        this.f20074b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f20073a) {
            case 0:
                f3 f3Var = this.f20074b.f1938f0;
                if (f3Var == null) {
                    mVar = null;
                } else {
                    mVar = f3Var.f20081b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f20074b.m();
                return;
        }
    }
}
