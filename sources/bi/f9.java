package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f9 implements View.OnFocusChangeListener {
    public final i9 f2717a;

    public f9(i9 i9Var) {
        this.f2717a = i9Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            i9 i9Var = this.f2717a;
            i9Var.f2870i0 = true;
            ii.o oVar = new ii.o(i9Var.getContext(), 2);
            oVar.f41760a = 1;
            oVar.f10694p = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.c0) i9Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
