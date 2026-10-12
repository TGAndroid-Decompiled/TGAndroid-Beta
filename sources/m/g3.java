package m;

import androidx.appcompat.widget.Toolbar;
public final class g3 implements Runnable {
    public final int f15426a;
    public final Toolbar f15427b;

    public g3(Toolbar toolbar, int i10) {
        this.f15426a = i10;
        this.f15427b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f15426a) {
            case 0:
                i3 i3Var = this.f15427b.f2279e0;
                if (i3Var == null) {
                    mVar = null;
                } else {
                    mVar = i3Var.f15457b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15427b.m();
                return;
        }
    }
}
