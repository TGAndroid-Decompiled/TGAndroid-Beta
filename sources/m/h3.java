package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f13526a;
    public final Toolbar f13527b;

    public h3(Toolbar toolbar, int i10) {
        this.f13526a = i10;
        this.f13527b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f13526a) {
            case 0:
                j3 j3Var = this.f13527b.f437b0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f13542b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f13527b.m();
                return;
        }
    }
}
