package hi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class u6 implements View.OnFocusChangeListener {
    public final int f15537a;
    public final KeyEvent.Callback f15538b;

    public u6(KeyEvent.Callback callback, int i7) {
        this.f15537a = i7;
        this.f15538b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15537a) {
            case 0:
                if (z10) {
                    v6 v6Var = (v6) this.f15538b;
                    v6Var.f15580e2 = true;
                    pi.l lVar = new pi.l(v6Var.getContext(), 2);
                    lVar.f59067a = 1;
                    lVar.f55699p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24112m) - org.telegram.messenger.g0.L(1.0f);
                    ((v4.c0) v6Var.f39534o1.getLayoutManager()).w0(lVar);
                    return;
                }
                return;
            case 1:
                SearchView searchView = (SearchView) this.f15538b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1895e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f15538b;
                i3Var.f30804n = z10;
                if (i3Var.h) {
                    i3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.f15538b;
                l3Var.f30976s = z10;
                if (l3Var.f30974n) {
                    l3Var.c();
                }
                l3Var.a(z10);
                return;
        }
    }
}
