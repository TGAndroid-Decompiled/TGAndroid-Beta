package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f16277a;
    public final Toolbar f16278b;

    public h3(Toolbar toolbar, int i10) {
        this.f16277a = i10;
        this.f16278b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f16277a) {
            case 0:
                j3 j3Var = this.f16278b.f2801e0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f16298b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f16278b.m();
                return;
        }
    }
}
