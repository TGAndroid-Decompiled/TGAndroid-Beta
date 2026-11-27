package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ie6 implements Runnable {
    public final byte a;
    public final qh6 b;

    public ie6(qh6 qh6Var, byte b) {
        this.a = b;
        this.b = qh6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                qh6Var.d0 = false;
                return;
            case 1:
                qh6Var.y0 = false;
                qh6Var.N1(true, true);
                return;
            default:
                if (qh6Var.getParentActivity() != null && !qh6Var.getParentActivity().isFinishing() && qh6Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                    String M0 = ob6.M0(2131745798, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131745677, null);
                    alertDialog$Builder.j(ob6.M0(2131747558, null), new ke6(qh6Var, (byte) 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
