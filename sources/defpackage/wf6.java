package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wf6 implements fd {
    public final byte a;
    public final cg6 b;

    public wf6(cg6 cg6Var, byte b) {
        this.a = b;
        this.b = cg6Var;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        cg6 cg6Var = this.b;
        switch (b) {
            case 0:
                cg6Var.c(true);
                cg6Var.Q.J1(0, true, null, true);
                cg6Var.n();
                return;
            case 1:
                cg6Var.Q.s0.popup = false;
                cg6Var.h(null);
                return;
            case 2:
                qh6 qh6Var = cg6Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                String M0 = ob6.M0(2131743851, "TermsOfService");
                id idVar2 = alertDialog$Builder.a;
                idVar2.S = M0;
                idVar2.U = ob6.M0(2131743632, "TosDecline");
                alertDialog$Builder.j(ob6.M0(2131745048, "SignUp"), new wf6(cg6Var, (byte) 3));
                alertDialog$Builder.g(ob6.M0(2131751569, "Decline"), new wf6(cg6Var, (byte) 4));
                qh6Var.showDialog(idVar2);
                return;
            case 3:
                cg6Var.Q.s0.popup = false;
                cg6Var.h(null);
                return;
            default:
                cg6Var.c(true);
                cg6Var.Q.J1(0, true, null, true);
                return;
        }
    }
}
