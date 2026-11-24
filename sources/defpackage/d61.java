package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class d61 extends o71 {
    public final byte I = 1;
    public final Object J;

    public d61(je3 je3Var, Context context, d dVar) {
        super(context, dVar, null, null);
        this.J = je3Var;
    }

    public final void f(boolean z) {
        r61 r61Var = (r61) this.J;
        if (z) {
            fm0 fm0Var = r61Var.T;
            if (fm0Var != null) {
                fm0Var.a(true, true);
            }
            r61.a0(r61Var).J();
            return;
        }
        r61.b0(r61Var).w();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.I) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((je3) this.J).q1 - a.getCurrentActionBarHeight()) - gl.m, 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public d61(r61 r61Var, Context context, r61 r61Var2, qw4 qw4Var, dha dhaVar) {
        super(context, r61Var2, qw4Var, dhaVar);
        this.J = r61Var;
    }
}
