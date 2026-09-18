package ci;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d8 implements View.OnFocusChangeListener {
    public final g8 f4539a;

    public d8(g8 g8Var) {
        this.f4539a = g8Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            g8 g8Var = this.f4539a;
            g8Var.f4707i0 = true;
            ji.o oVar = new ji.o(g8Var.getContext(), 2);
            oVar.f42852a = 1;
            oVar.f13105p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((s4.c0) g8Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
