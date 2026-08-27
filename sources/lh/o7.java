package lh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class o7 implements View.OnFocusChangeListener {

    public final r7 f16485a;

    public o7(r7 r7Var) {
        this.f16485a = r7Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            r7 r7Var = this.f16485a;
            r7Var.f16655e0 = true;
            f2.k0 k0Var = (f2.k0) r7Var.d.getLayoutManager();
            sh.n nVar = new sh.n(r7Var.getContext(), 2);
            nVar.f5731a = 1;
            nVar.f47990p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            k0Var.w0(nVar);
        }
    }
}
