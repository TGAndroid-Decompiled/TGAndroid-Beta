package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class k71 extends w81 {
    public final byte I = 1;
    public final Object J;

    public k71(wf3 wf3Var, Context context, d dVar) {
        super(context, dVar, null, null);
        this.J = wf3Var;
    }

    public final void f(boolean z) {
        y71 y71Var = (y71) this.J;
        if (z) {
            fn0 fn0Var = y71Var.T;
            if (fn0Var != null) {
                fn0Var.a(true, true);
            }
            y71.b0(y71Var).J();
            return;
        }
        y71.c0(y71Var).w();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.I) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((wf3) this.J).q1 - a.getCurrentActionBarHeight()) - gm.m, 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public k71(y71 y71Var, Context context, y71 y71Var2, sy4 sy4Var, fja fjaVar) {
        super(context, y71Var2, sy4Var, fjaVar);
        this.J = y71Var;
    }
}
