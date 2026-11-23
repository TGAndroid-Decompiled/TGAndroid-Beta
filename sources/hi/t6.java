package hi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class t6 implements View.OnFocusChangeListener {
    public final int f15509a;
    public final KeyEvent.Callback f15510b;

    public t6(KeyEvent.Callback callback, int i7) {
        this.f15509a = i7;
        this.f15510b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15509a) {
            case 0:
                if (z10) {
                    u6 u6Var = (u6) this.f15510b;
                    u6Var.f15550e2 = true;
                    pi.l lVar = new pi.l(u6Var.getContext(), 2);
                    lVar.f59109a = 1;
                    lVar.f55744p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m) - org.telegram.messenger.g0.L(1.0f);
                    ((v4.c0) u6Var.f39531o1.getLayoutManager()).w0(lVar);
                    return;
                }
                return;
            case 1:
                SearchView searchView = (SearchView) this.f15510b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1914e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f15510b;
                i3Var.f30835n = z10;
                if (i3Var.h) {
                    i3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.f15510b;
                l3Var.f31007s = z10;
                if (l3Var.f31005n) {
                    l3Var.c();
                }
                l3Var.a(z10);
                return;
        }
    }
}
