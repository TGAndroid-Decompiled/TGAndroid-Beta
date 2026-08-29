package nh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d7 implements View.OnFocusChangeListener {
    public final g7 f17534a;

    public d7(g7 g7Var) {
        this.f17534a = g7Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            g7 g7Var = this.f17534a;
            g7Var.f17711e0 = true;
            uh.n nVar = new uh.n(g7Var.getContext(), 2);
            nVar.f6373a = 1;
            nVar.f49306p = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((f2.j0) g7Var.d.getLayoutManager()).w0(nVar);
        }
    }
}
