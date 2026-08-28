package bg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.wk0;
public final class b3 extends fg.m {
    public boolean F;
    public final g3 G;

    public b3(g3 g3Var, Context context, b6 b6Var) {
        super(context, b6Var);
        this.G = g3Var;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        g3 g3Var = this.G;
        g3Var.m0 = dp;
        g3Var.f1784l0.G();
        if (this.F != g3Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = g3Var.isKeyboardVisible();
            this.F = isKeyboardVisible;
            if (isKeyboardVisible) {
                wk0 wk0Var = g3Var.d;
                rh.n nVar = new rh.n(g3Var.getContext(), 2, 0.6f);
                nVar.f5443a = 1;
                nVar.f47269p = AndroidUtilities.dp(36.0f);
                wk0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
