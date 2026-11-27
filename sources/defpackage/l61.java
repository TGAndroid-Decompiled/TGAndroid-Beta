package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class l61 extends w71 {
    public final byte I = 1;
    public final Object J;

    public l61(df3 df3Var, Context context, e eVar) {
        super(context, eVar, null, null);
        this.J = df3Var;
    }

    public final void f(boolean z) {
        z61 z61Var = (z61) this.J;
        if (z) {
            fm0 fm0Var = z61Var.T;
            if (fm0Var != null) {
                fm0Var.a(true, true);
            }
            z61.a0(z61Var).L();
            return;
        }
        z61.b0(z61Var).y();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.I) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((df3) this.J).q1 - a.getCurrentActionBarHeight()) - hl.m, 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public l61(z61 z61Var, Context context, z61 z61Var2, vy4 vy4Var, wka wkaVar) {
        super(context, z61Var2, vy4Var, wkaVar);
        this.J = z61Var;
    }
}
