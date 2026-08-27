package m;

import androidx.appcompat.widget.Toolbar;

public final class h3 implements Runnable {

    public final int f17335a;

    public final Toolbar f17336b;

    public h3(Toolbar toolbar, int i10) {
        this.f17335a = i10;
        this.f17336b = toolbar;
    }

    @Override
    public final void run() {
        switch (this.f17335a) {
            case 0:
                k3 k3Var = this.f17336b.f1019a0;
                l.n nVar = k3Var == null ? null : k3Var.f17366b;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f17336b.m();
                break;
        }
    }
}
