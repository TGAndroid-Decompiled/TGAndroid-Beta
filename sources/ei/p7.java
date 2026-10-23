package ei;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p7 implements View.OnFocusChangeListener {
    public final s7 f9611a;

    public p7(s7 s7Var) {
        this.f9611a = s7Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            s7 s7Var = this.f9611a;
            s7Var.f9815i0 = true;
            li.n nVar = new li.n(s7Var.getContext(), 2);
            nVar.f46484a = 1;
            nVar.f16207p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.b0) s7Var.d.getLayoutManager()).w0(nVar);
        }
    }
}
