package ii;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.s70;
public final class p3 extends org.telegram.ui.Cells.n4 {
    public final s70 f15144r;

    public p3(Context context, e6 e6Var) {
        super(context, e6Var);
        int i3;
        s70 s70Var = new s70(context, e6Var);
        this.f15144r = s70Var;
        s70Var.setTextSize(1, 14.0f);
        r6.V(s70Var, k6.f28290z6, e6Var);
        r6.H(s70Var, k6.L6, e6Var);
        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        if (bd.f21784a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        addView(s70Var, mf.d(-2, -2.0f, i3 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
