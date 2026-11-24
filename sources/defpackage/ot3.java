package defpackage;

import android.app.Dialog;
import android.content.Context;
public final class ot3 extends Dialog {
    public final hu0 a;

    public ot3(hu0 hu0Var, Context context) {
        super(context);
        this.a = hu0Var;
    }

    @Override
    public final void dismiss() {
        pt3 pt3Var = (pt3) this.a.b;
        pt3Var.a.k(false);
        pt3Var.a.e();
    }
}
