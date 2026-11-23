package bi;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class n6 extends n41 {
    public static final int f3956b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        org.telegram.ui.ActionBar.h6 h6Var;
        m80 m80Var = (m80) view;
        m80Var.setGravity(o41Var.A);
        Object obj = o41Var.I;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = o41Var.H;
            if (obj2 instanceof org.telegram.ui.ActionBar.h6) {
                h6Var = (org.telegram.ui.ActionBar.h6) obj2;
            } else {
                h6Var = null;
            }
            org.telegram.ui.ActionBar.t6.U(m80Var, intValue, h6Var);
        } else {
            org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.f30068a;
            m80Var.setTag(2131296711, null);
            m80Var.setTextColor((int) o41Var.C);
        }
        m80Var.setTextSize(1, o41Var.B);
        if (o41Var.f38097r) {
            typeface = org.telegram.messenger.g0.o();
        }
        m80Var.setTypeface(typeface);
        int i7 = o41Var.f38088i;
        m80Var.setPadding(i7, 0, i7, o41Var.f38090k);
        m80Var.setText(o41Var.f38092m);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new u2(2, context, null);
    }
}
