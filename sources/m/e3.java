package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f15724a;
    public final Toolbar f15725b;

    public e3(Toolbar toolbar, int i10) {
        this.f15724a = i10;
        this.f15725b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f15724a) {
            case 0:
                h3 h3Var = this.f15725b.f2281e0;
                if (h3Var == null) {
                    mVar = null;
                } else {
                    mVar = h3Var.f15756b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15725b.m();
                return;
        }
    }
}
