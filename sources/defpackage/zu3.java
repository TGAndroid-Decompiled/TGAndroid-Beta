package defpackage;

import android.app.Dialog;
import android.content.Context;
public final class zu3 extends Dialog {
    public final qv0 a;

    public zu3(qv0 qv0Var, Context context) {
        super(context);
        this.a = qv0Var;
    }

    @Override
    public final void dismiss() {
        av3 av3Var = (av3) this.a.b;
        av3Var.a.k(false);
        av3Var.a.e();
    }
}
