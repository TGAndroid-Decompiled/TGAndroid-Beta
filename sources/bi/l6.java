package bi;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class l6 extends k41 {
    public static final int f3848b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        org.telegram.ui.ActionBar.i6 i6Var;
        k80 k80Var = (k80) view;
        k80Var.setGravity(l41Var.A);
        Object obj = l41Var.I;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = l41Var.H;
            if (obj2 instanceof org.telegram.ui.ActionBar.i6) {
                i6Var = (org.telegram.ui.ActionBar.i6) obj2;
            } else {
                i6Var = null;
            }
            org.telegram.ui.ActionBar.u6.U(k80Var, intValue, i6Var);
        } else {
            org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30084a;
            k80Var.setTag(2131296709, null);
            k80Var.setTextColor((int) l41Var.C);
        }
        k80Var.setTextSize(1, l41Var.B);
        if (l41Var.f37023r) {
            typeface = org.telegram.messenger.g0.o();
        }
        k80Var.setTypeface(typeface);
        int i7 = l41Var.f37014i;
        k80Var.setPadding(i7, 0, i7, l41Var.f37016k);
        k80Var.setText(l41Var.f37018m);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new q2(2, context, null);
    }
}
