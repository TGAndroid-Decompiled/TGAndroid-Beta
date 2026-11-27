package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ysc implements Runnable {
    public final byte a;
    public final atc b;

    public ysc(atc atcVar, byte b) {
        this.a = b;
        this.b = atcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        atc atcVar = this.b;
        switch (b) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, atcVar.getResourceProvider(), atcVar.getParentActivity());
                alertDialog$Builder.a.U = ob6.M0(2131742775, null);
                c00.u(null, 2131747558, alertDialog$Builder, null);
                return;
            default:
                atcVar.c0();
                return;
        }
    }
}
