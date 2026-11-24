package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dl1 implements Runnable {
    public final byte a = 0;
    public final mu1 b;
    public final na7 c;
    public final CharSequence d;
    public final boolean e;

    public dl1(mu1 mu1Var, na7 na7Var, CharSequence charSequence, boolean z) {
        this.b = mu1Var;
        this.c = na7Var;
        this.d = charSequence;
        this.e = z;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p9(this.d, this.c, this.e);
                return;
            default:
                mu1 mu1Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.Ba, mu1Var.getParentActivity());
                String M0 = k96.M0(2131689472, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                String M02 = k96.M0(2131747638, null);
                na7 na7Var = this.c;
                alertDialog$Builder.j(M02, new xf(mu1Var, na7Var, this.d, this.e, (byte) 1));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hdVar.U = k96.M0(2131745493, null);
                mu1Var.showDialog(hdVar);
                na7Var.z2 = 0;
                na7.c1().edit().putInt("secretWebpage2", na7Var.z2).commit();
                return;
        }
    }

    public dl1(mu1 mu1Var, CharSequence charSequence, na7 na7Var, boolean z) {
        this.b = mu1Var;
        this.d = charSequence;
        this.c = na7Var;
        this.e = z;
    }
}
