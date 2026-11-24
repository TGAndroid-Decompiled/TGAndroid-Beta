package defpackage;

import androidx.appcompat.widget.Toolbar;
public final class btb implements Runnable {
    public final byte a;
    public final Toolbar b;

    public btb(Toolbar toolbar, byte b) {
        this.a = b;
        this.b = toolbar;
    }

    @Override
    public final void run() {
        c07 c07Var;
        byte b = this.a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                dtb dtbVar = toolbar.f0;
                if (dtbVar == null) {
                    c07Var = null;
                } else {
                    c07Var = dtbVar.b;
                }
                if (c07Var != null) {
                    c07Var.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.m();
                return;
        }
    }
}
