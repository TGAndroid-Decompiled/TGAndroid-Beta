package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z7 implements View.OnFocusChangeListener {
    public final c8 f6374a;

    public z7(c8 c8Var) {
        this.f6374a = c8Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            c8 c8Var = this.f6374a;
            c8Var.f4819i0 = true;
            ji.o oVar = new ji.o(c8Var.getContext(), 2);
            oVar.f46706a = 1;
            oVar.f14237p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.c0) c8Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
