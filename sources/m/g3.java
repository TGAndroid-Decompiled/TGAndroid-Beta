package m;

import androidx.appcompat.widget.Toolbar;
public final class g3 implements Runnable {
    public final int f13200a;
    public final Toolbar f13201b;

    public g3(Toolbar toolbar, int i10) {
        this.f13200a = i10;
        this.f13201b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f13200a) {
            case 0:
                i3 i3Var = this.f13201b.f483b0;
                if (i3Var == null) {
                    nVar = null;
                } else {
                    nVar = i3Var.f13222b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f13201b.m();
                return;
        }
    }
}
