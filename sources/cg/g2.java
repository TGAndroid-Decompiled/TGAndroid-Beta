package cg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;

public final class g2 extends gg.l {
    public final i2 F;

    public g2(i2 i2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.F = i2Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int iDp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        i2 i2Var = this.F;
        i2Var.f2720l0 = iDp;
        i2Var.f2719k0.G();
    }
}
