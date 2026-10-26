package fi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l7 implements View.OnFocusChangeListener {
    public final o7 f11177a;

    public l7(o7 o7Var) {
        this.f11177a = o7Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            o7 o7Var = this.f11177a;
            o7Var.f11404i0 = true;
            mi.n nVar = new mi.n(o7Var.getContext(), 2);
            nVar.f47680a = 1;
            nVar.f18556p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.c0) o7Var.d.getLayoutManager()).w0(nVar);
        }
    }
}
