package m;

import androidx.appcompat.widget.Toolbar;
public final class g3 implements Runnable {
    public final int f15425a;
    public final Toolbar f15426b;

    public g3(Toolbar toolbar, int i10) {
        this.f15425a = i10;
        this.f15426b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f15425a) {
            case 0:
                i3 i3Var = this.f15426b.f2279e0;
                if (i3Var == null) {
                    mVar = null;
                } else {
                    mVar = i3Var.f15456b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15426b.m();
                return;
        }
    }
}
