package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class moc implements Runnable {
    public final byte a;
    public final noc b;

    public moc(noc nocVar, byte b) {
        this.a = b;
        this.b = nocVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        noc nocVar = this.b;
        switch (b) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nocVar.getResourceProvider(), nocVar.getParentActivity());
                alertDialog$Builder.a.U = k96.M0(2131742881, null);
                b00.t(null, 2131747638, alertDialog$Builder, null);
                return;
            default:
                nocVar.c0();
                return;
        }
    }
}
