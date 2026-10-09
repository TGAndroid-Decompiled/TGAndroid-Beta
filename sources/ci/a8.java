package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a8 implements View.OnFocusChangeListener {
    public final d8 f4728a;

    public a8(d8 d8Var) {
        this.f4728a = d8Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            d8 d8Var = this.f4728a;
            d8Var.f4954i0 = true;
            ji.o oVar = new ji.o(d8Var.getContext(), 2);
            oVar.f47825a = 1;
            oVar.f14273p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.d0) d8Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
