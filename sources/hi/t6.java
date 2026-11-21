package hi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class t6 implements View.OnFocusChangeListener {
    public final int f15506a;
    public final KeyEvent.Callback f15507b;

    public t6(KeyEvent.Callback callback, int i7) {
        this.f15506a = i7;
        this.f15507b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15506a) {
            case 0:
                if (z10) {
                    u6 u6Var = (u6) this.f15507b;
                    u6Var.f15547e2 = true;
                    pi.l lVar = new pi.l(u6Var.getContext(), 2);
                    lVar.f59105a = 1;
                    lVar.f55740p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24140m) - org.telegram.messenger.g0.L(1.0f);
                    ((v4.c0) u6Var.f39539o1.getLayoutManager()).w0(lVar);
                    return;
                }
                return;
            case 1:
                SearchView searchView = (SearchView) this.f15507b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1907e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f15507b;
                i3Var.f30832n = z10;
                if (i3Var.h) {
                    i3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.f15507b;
                l3Var.f31004s = z10;
                if (l3Var.f31002n) {
                    l3Var.c();
                }
                l3Var.a(z10);
                return;
        }
    }
}
