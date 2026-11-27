package defpackage;

import android.app.Dialog;
import android.content.Context;
public final class fu3 extends Dialog {
    public final qu0 a;

    public fu3(qu0 qu0Var, Context context) {
        super(context);
        this.a = qu0Var;
    }

    @Override
    public final void dismiss() {
        gu3 gu3Var = (gu3) this.a.b;
        gu3Var.a.k(false);
        gu3Var.a.e();
    }
}
