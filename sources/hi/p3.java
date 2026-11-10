package hi;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.w70;
public final class p3 extends org.telegram.ui.Cells.n4 {
    public final w70 f14872r;

    public p3(Context context, h6 h6Var) {
        super(context, h6Var);
        int i7;
        w70 w70Var = new w70(context, h6Var);
        this.f14872r = w70Var;
        w70Var.setTextSize(1, 14.0f);
        t6.U(w70Var, m6.f28300z6, h6Var);
        t6.G(w70Var, m6.L6, h6Var);
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        if (id.f23161a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(w70Var, ha.d(-2, -2.0f, i7 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
