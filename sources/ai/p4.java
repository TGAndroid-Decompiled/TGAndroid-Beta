package ai;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
public final class p4 extends q31 {
    public static final int f881b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        org.telegram.ui.ActionBar.e6 e6Var;
        s70 s70Var = (s70) view;
        s70Var.setGravity(r31Var.f37640z);
        Object obj = r31Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = r31Var.G;
            if (obj2 instanceof org.telegram.ui.ActionBar.e6) {
                e6Var = (org.telegram.ui.ActionBar.e6) obj2;
            } else {
                e6Var = null;
            }
            org.telegram.ui.ActionBar.r6.V(s70Var, intValue, e6Var);
        } else {
            org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
            s70Var.setTag(2131296709, null);
            s70Var.setTextColor((int) r31Var.B);
        }
        s70Var.setTextSize(1, r31Var.A);
        if (r31Var.f37632q) {
            typeface = org.telegram.messenger.g0.o();
        }
        s70Var.setTypeface(typeface);
        int i3 = r31Var.f37624i;
        s70Var.setPadding(i3, 0, i3, r31Var.f37626k);
        s70Var.setText(r31Var.f37627l);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e2(2, context, null);
    }
}
