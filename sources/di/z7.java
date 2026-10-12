package di;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z7 implements View.OnFocusChangeListener {
    public final c8 f8187a;

    public z7(c8 c8Var) {
        this.f8187a = c8Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            c8 c8Var = this.f8187a;
            c8Var.f6719i0 = true;
            ki.o oVar = new ki.o(c8Var.getContext(), 2);
            oVar.f44979a = 1;
            oVar.f14352p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.b0) c8Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
