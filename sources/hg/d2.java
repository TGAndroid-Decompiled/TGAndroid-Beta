package hg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class d2 extends lg.k {
    public final f2 G;

    public d2(f2 f2Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.G = f2Var;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        f2 f2Var = this.G;
        f2Var.m0 = dp;
        f2Var.f7481l0.G();
    }
}
