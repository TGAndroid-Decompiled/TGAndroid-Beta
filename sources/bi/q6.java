package bi;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class q6 extends m41 {
    public static final int f4005b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        org.telegram.ui.ActionBar.i6 i6Var;
        j80 j80Var = (j80) view;
        j80Var.setGravity(n41Var.A);
        Object obj = n41Var.I;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = n41Var.H;
            if (obj2 instanceof org.telegram.ui.ActionBar.i6) {
                i6Var = (org.telegram.ui.ActionBar.i6) obj2;
            } else {
                i6Var = null;
            }
            org.telegram.ui.ActionBar.u6.U(j80Var, intValue, i6Var);
        } else {
            org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30163a;
            j80Var.setTag(2131296711, null);
            j80Var.setTextColor((int) n41Var.C);
        }
        j80Var.setTextSize(1, n41Var.B);
        if (n41Var.f37660r) {
            typeface = org.telegram.messenger.g0.o();
        }
        j80Var.setTypeface(typeface);
        int i7 = n41Var.f37651i;
        j80Var.setPadding(i7, 0, i7, n41Var.f37653k);
        j80Var.setText(n41Var.f37655m);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new w2(2, context, null);
    }
}
