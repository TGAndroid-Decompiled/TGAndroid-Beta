package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f15725a;
    public final Toolbar f15726b;

    public e3(Toolbar toolbar, int i10) {
        this.f15725a = i10;
        this.f15726b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f15725a) {
            case 0:
                g3 g3Var = this.f15726b.f2202e0;
                if (g3Var == null) {
                    mVar = null;
                } else {
                    mVar = g3Var.f15741b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15726b.m();
                return;
        }
    }
}
