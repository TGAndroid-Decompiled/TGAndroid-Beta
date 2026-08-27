package cg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zk0;

public final class t2 extends gg.l {
    public boolean F;
    public final y2 G;

    public t2(y2 y2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.G = y2Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int iDp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        y2 y2Var = this.G;
        y2Var.m0 = iDp;
        y2Var.f2879l0.G();
        if (this.F != y2Var.isKeyboardVisible()) {
            boolean zIsKeyboardVisible = y2Var.isKeyboardVisible();
            this.F = zIsKeyboardVisible;
            if (zIsKeyboardVisible) {
                zk0 zk0Var = y2Var.d;
                sh.n nVar = new sh.n(y2Var.getContext(), 2, 0.6f);
                nVar.f5731a = 1;
                nVar.f47990p = AndroidUtilities.dp(36.0f);
                zk0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
