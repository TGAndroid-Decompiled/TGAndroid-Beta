package hi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class u6 implements View.OnFocusChangeListener {
    public final int f15190a;
    public final KeyEvent.Callback f15191b;

    public u6(KeyEvent.Callback callback, int i7) {
        this.f15190a = i7;
        this.f15191b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15190a) {
            case 0:
                if (z10) {
                    v6 v6Var = (v6) this.f15191b;
                    v6Var.f15223e2 = true;
                    pi.l lVar = new pi.l(v6Var.getContext(), 2);
                    lVar.f58480a = 1;
                    lVar.f55123p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(1.0f);
                    ((v4.b0) v6Var.f35936o1.getLayoutManager()).w0(lVar);
                    return;
                }
                return;
            case 1:
                SearchView searchView = (SearchView) this.f15191b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1896e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f15191b;
                h3Var.f30379n = z10;
                if (h3Var.h) {
                    h3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.f15191b;
                k3Var.f30551s = z10;
                if (k3Var.f30549n) {
                    k3Var.c();
                }
                k3Var.a(z10);
                return;
        }
    }
}
