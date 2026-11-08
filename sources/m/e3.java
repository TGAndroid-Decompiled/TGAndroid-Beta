package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f19099a;
    public final Toolbar f19100b;

    public e3(Toolbar toolbar, int i7) {
        this.f19099a = i7;
        this.f19100b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f19099a) {
            case 0:
                h3 h3Var = this.f19100b.f1981e0;
                if (h3Var == null) {
                    mVar = null;
                } else {
                    mVar = h3Var.f19120b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f19100b.m();
                return;
        }
    }
}
