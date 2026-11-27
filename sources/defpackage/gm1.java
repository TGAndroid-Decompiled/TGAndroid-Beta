package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gm1 implements Runnable {
    public final byte a = 0;
    public final zu1 b;
    public final uc7 c;
    public final CharSequence d;
    public final boolean e;

    public gm1(zu1 zu1Var, uc7 uc7Var, CharSequence charSequence, boolean z) {
        this.b = zu1Var;
        this.c = uc7Var;
        this.d = charSequence;
        this.e = z;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C9(this.d, this.c, this.e);
                return;
            default:
                zu1 zu1Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.Ba, zu1Var.getParentActivity());
                String M0 = ob6.M0(2131689472, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                String M02 = ob6.M0(2131747558, null);
                uc7 uc7Var = this.c;
                alertDialog$Builder.j(M02, new ag(zu1Var, uc7Var, this.d, this.e, (byte) 1));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                idVar.U = ob6.M0(2131745413, null);
                zu1Var.showDialog(idVar);
                uc7Var.z2 = 0;
                uc7.e1().edit().putInt("secretWebpage2", uc7Var.z2).commit();
                return;
        }
    }

    public gm1(zu1 zu1Var, CharSequence charSequence, uc7 uc7Var, boolean z) {
        this.b = zu1Var;
        this.d = charSequence;
        this.c = uc7Var;
        this.e = z;
    }
}
