package di;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d8 implements View.OnFocusChangeListener {
    public final g8 f7132a;

    public d8(g8 g8Var) {
        this.f7132a = g8Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            g8 g8Var = this.f7132a;
            g8Var.f7308i0 = true;
            ki.p pVar = new ki.p(g8Var.getContext(), 2);
            pVar.f45934a = 1;
            pVar.f15068p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.c0) g8Var.d.getLayoutManager()).w0(pVar);
        }
    }
}
