package gg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class d2 extends kg.k {
    public final f2 G;

    public d2(f2 f2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.G = f2Var;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        f2 f2Var = this.G;
        f2Var.m0 = dp;
        f2Var.f6637l0.G();
    }
}
