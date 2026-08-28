package bg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
public final class n2 extends fg.m {
    public final q2 F;

    public n2(q2 q2Var, Context context, b6 b6Var) {
        super(context, b6Var);
        this.F = q2Var;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        q2 q2Var = this.F;
        q2Var.f1934l0 = dp;
        q2Var.f1933k0.G();
    }
}
