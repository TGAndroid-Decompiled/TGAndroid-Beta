package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f19104a;
    public final Toolbar f19105b;

    public e3(Toolbar toolbar, int i7) {
        this.f19104a = i7;
        this.f19105b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f19104a) {
            case 0:
                h3 h3Var = this.f19105b.f1981e0;
                if (h3Var == null) {
                    mVar = null;
                } else {
                    mVar = h3Var.f19125b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f19105b.m();
                return;
        }
    }
}
