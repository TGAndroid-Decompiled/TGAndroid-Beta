package hi;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.x70;
public final class p3 extends org.telegram.ui.Cells.n4 {
    public final x70 f14870r;

    public p3(Context context, g6 g6Var) {
        super(context, g6Var);
        int i7;
        x70 x70Var = new x70(context, g6Var);
        this.f14870r = x70Var;
        x70Var.setTextSize(1, 14.0f);
        s6.U(x70Var, l6.f28275z6, g6Var);
        s6.G(x70Var, l6.L6, g6Var);
        x70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        if (id.f23157a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(x70Var, ha.d(-2, -2.0f, i7 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
