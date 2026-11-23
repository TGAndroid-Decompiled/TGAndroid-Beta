package hi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class u6 implements View.OnFocusChangeListener {
    public final int f15496a;
    public final KeyEvent.Callback f15497b;

    public u6(KeyEvent.Callback callback, int i7) {
        this.f15496a = i7;
        this.f15497b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15496a) {
            case 0:
                if (z10) {
                    v6 v6Var = (v6) this.f15497b;
                    v6Var.f15535e2 = true;
                    pi.l lVar = new pi.l(v6Var.getContext(), 2);
                    lVar.f59055a = 1;
                    lVar.f55709p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(1.0f);
                    ((v4.b0) v6Var.f39487o1.getLayoutManager()).w0(lVar);
                    return;
                }
                return;
            case 1:
                SearchView searchView = (SearchView) this.f15497b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1865e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f15497b;
                i3Var.f30801n = z10;
                if (i3Var.h) {
                    i3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.f15497b;
                l3Var.f30973s = z10;
                if (l3Var.f30971n) {
                    l3Var.c();
                }
                l3Var.a(z10);
                return;
        }
    }
}
