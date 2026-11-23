package hi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class d7 implements View.OnFocusChangeListener {
    public final int f14316a;
    public final KeyEvent.Callback f14317b;

    public d7(KeyEvent.Callback callback, int i7) {
        this.f14316a = i7;
        this.f14317b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14316a) {
            case 0:
                if (z10) {
                    e7 e7Var = (e7) this.f14317b;
                    e7Var.f14378e2 = true;
                    pi.l lVar = new pi.l(e7Var.getContext(), 2);
                    lVar.f59190a = 1;
                    lVar.f55822p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(1.0f);
                    ((v4.c0) e7Var.f39246o1.getLayoutManager()).w0(lVar);
                    return;
                }
                return;
            case 1:
                SearchView searchView = (SearchView) this.f14317b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1866e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f14317b;
                i3Var.f30891n = z10;
                if (i3Var.h) {
                    i3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.f14317b;
                l3Var.f31072s = z10;
                if (l3Var.f31070n) {
                    l3Var.c();
                }
                l3Var.a(z10);
                return;
        }
    }
}
