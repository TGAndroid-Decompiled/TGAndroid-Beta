package eg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
public final class r2 extends ig.k {
    public boolean F;
    public final w2 G;

    public r2(w2 w2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.G = w2Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        w2 w2Var = this.G;
        w2Var.m0 = dp;
        w2Var.f6173l0.G();
        if (this.F != w2Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = w2Var.isKeyboardVisible();
            this.F = isKeyboardVisible;
            if (isKeyboardVisible) {
                jl0 jl0Var = w2Var.d;
                uh.n nVar = new uh.n(w2Var.getContext(), 2, 0.6f);
                nVar.f6373a = 1;
                nVar.f49306p = AndroidUtilities.dp(36.0f);
                jl0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
