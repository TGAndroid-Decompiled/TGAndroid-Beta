package kh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p7 implements View.OnFocusChangeListener {
    public final s7 f15839a;

    public p7(s7 s7Var) {
        this.f15839a = s7Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            s7 s7Var = this.f15839a;
            s7Var.f16037e0 = true;
            rh.n nVar = new rh.n(s7Var.getContext(), 2);
            nVar.f5443a = 1;
            nVar.f47269p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((f2.m0) s7Var.d.getLayoutManager()).w0(nVar);
        }
    }
}
