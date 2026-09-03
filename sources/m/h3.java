package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f13510a;
    public final Toolbar f13511b;

    public h3(Toolbar toolbar, int i10) {
        this.f13510a = i10;
        this.f13511b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f13510a) {
            case 0:
                j3 j3Var = this.f13511b.f452b0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f13526b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f13511b.m();
                return;
        }
    }
}
