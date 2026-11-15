package bi;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
public final class d4 extends a41 {
    public static final int f3442b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        org.telegram.ui.ActionBar.e6 e6Var;
        z70 z70Var = (z70) view;
        z70Var.setGravity(b41Var.f33194z);
        Object obj = b41Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = b41Var.G;
            if (obj2 instanceof org.telegram.ui.ActionBar.e6) {
                e6Var = (org.telegram.ui.ActionBar.e6) obj2;
            } else {
                e6Var = null;
            }
            org.telegram.ui.ActionBar.q6.U(z70Var, intValue, e6Var);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.f29534a;
            z70Var.setTag(2131296709, null);
            z70Var.setTextColor((int) b41Var.B);
        }
        z70Var.setTextSize(1, b41Var.A);
        if (b41Var.f33186q) {
            typeface = org.telegram.messenger.g0.o();
        }
        z70Var.setTypeface(typeface);
        int i7 = b41Var.f33178i;
        z70Var.setPadding(i7, 0, i7, b41Var.f33180k);
        z70Var.setText(b41Var.f33181l);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w1(2, context, null);
    }
}
