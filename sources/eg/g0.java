package eg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.dq;

public final class g0 extends x8 {
    public final c6 v;

    public g0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.v = c6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = g6.f23018b7;
        c6 c6Var = this.v;
        dq dqVar = new dq(new ColorDrawable(g6.v0(g6.f22999a7, c6Var)), g6.U0(context, i10, g6.v0(i11, c6Var)), 0, 0);
        dqVar.f27828w = true;
        setBackground(dqVar);
    }
}
