package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z7 implements View.OnFocusChangeListener {
    public final c8 f5915a;

    public z7(c8 c8Var) {
        this.f5915a = c8Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            c8 c8Var = this.f5915a;
            c8Var.f4459i0 = true;
            ji.o oVar = new ji.o(c8Var.getContext(), 2);
            oVar.f43155a = 1;
            oVar.f13097p = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.c0) c8Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
