package defpackage;

import androidx.appcompat.widget.Toolbar;
public final class cxb implements Runnable {
    public final byte a;
    public final Toolbar b;

    public cxb(Toolbar toolbar, byte b) {
        this.a = b;
        this.b = toolbar;
    }

    @Override
    public final void run() {
        j27 j27Var;
        byte b = this.a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                exb exbVar = toolbar.f0;
                if (exbVar == null) {
                    j27Var = null;
                } else {
                    j27Var = exbVar.b;
                }
                if (j27Var != null) {
                    j27Var.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.m();
                return;
        }
    }
}
