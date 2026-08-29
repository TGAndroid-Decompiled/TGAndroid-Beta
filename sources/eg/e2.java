package eg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
public final class e2 extends ig.k {
    public final g2 F;

    public e2(g2 g2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.F = g2Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        g2 g2Var = this.F;
        g2Var.f6014l0 = dp;
        g2Var.f6013k0.G();
    }
}
