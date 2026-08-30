package gg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sl0;
public final class q2 extends kg.k {
    public boolean G;
    public final v2 H;

    public q2(v2 v2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.H = v2Var;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        v2 v2Var = this.H;
        v2Var.f6788n0 = dp;
        v2Var.m0.G();
        if (this.G != v2Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = v2Var.isKeyboardVisible();
            this.G = isKeyboardVisible;
            if (isKeyboardVisible) {
                sl0 sl0Var = v2Var.d;
                wh.o oVar = new wh.o(v2Var.getContext(), 2, 0.6f);
                oVar.f5723a = 1;
                oVar.f46638p = AndroidUtilities.dp(36.0f);
                sl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
