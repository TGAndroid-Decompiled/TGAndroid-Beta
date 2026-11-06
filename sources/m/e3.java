package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f19096a;
    public final Toolbar f19097b;

    public e3(Toolbar toolbar, int i7) {
        this.f19096a = i7;
        this.f19097b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f19096a) {
            case 0:
                h3 h3Var = this.f19097b.f1981e0;
                if (h3Var == null) {
                    mVar = null;
                } else {
                    mVar = h3Var.f19117b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f19097b.m();
                return;
        }
    }
}
