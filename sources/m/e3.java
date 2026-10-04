package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f15730a;
    public final Toolbar f15731b;

    public e3(Toolbar toolbar, int i10) {
        this.f15730a = i10;
        this.f15731b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f15730a) {
            case 0:
                g3 g3Var = this.f15731b.f2202e0;
                if (g3Var == null) {
                    mVar = null;
                } else {
                    mVar = g3Var.f15746b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15731b.m();
                return;
        }
    }
}
