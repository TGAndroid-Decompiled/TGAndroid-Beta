package hi;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.w70;
public final class p3 extends org.telegram.ui.Cells.n4 {
    public final w70 f14870r;

    public p3(Context context, f6 f6Var) {
        super(context, f6Var);
        int i7;
        w70 w70Var = new w70(context, f6Var);
        this.f14870r = w70Var;
        w70Var.setTextSize(1, 14.0f);
        r6.V(w70Var, k6.f28262z6, f6Var);
        r6.H(w70Var, k6.L6, f6Var);
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        if (id.f23157a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(w70Var, ha.d(-2, -2.0f, i7 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
