package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mm1 implements Runnable {
    public final byte a = 0;
    public final yv1 b;
    public final oc7 c;
    public final CharSequence d;
    public final boolean e;

    public mm1(yv1 yv1Var, oc7 oc7Var, CharSequence charSequence, boolean z) {
        this.b = yv1Var;
        this.c = oc7Var;
        this.d = charSequence;
        this.e = z;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B9(this.d, this.c, this.e);
                return;
            default:
                yv1 yv1Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.Ba, yv1Var.getParentActivity());
                String M0 = jb6.M0(2131689472, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                String M02 = jb6.M0(2131747564, null);
                oc7 oc7Var = this.c;
                alertDialog$Builder.j(M02, new wg(yv1Var, oc7Var, this.d, this.e, (byte) 1));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                heVar.U = jb6.M0(2131745419, null);
                yv1Var.showDialog(heVar);
                oc7Var.z2 = 0;
                oc7.d1().edit().putInt("secretWebpage2", oc7Var.z2).commit();
                return;
        }
    }

    public mm1(yv1 yv1Var, CharSequence charSequence, oc7 oc7Var, boolean z) {
        this.b = yv1Var;
        this.d = charSequence;
        this.c = oc7Var;
        this.e = z;
    }
}
