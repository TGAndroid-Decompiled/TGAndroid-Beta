package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oqc implements Runnable {
    public final byte a;
    public final pqc b;

    public oqc(pqc pqcVar, byte b) {
        this.a = b;
        this.b = pqcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pqc pqcVar = this.b;
        switch (b) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, pqcVar.getResourceProvider(), pqcVar.getParentActivity());
                alertDialog$Builder.a.U = jb6.M0(2131742807, null);
                b10.t(null, 2131747564, alertDialog$Builder, null);
                return;
            default:
                pqcVar.d0();
                return;
        }
    }
}
