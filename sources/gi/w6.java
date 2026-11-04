package gi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class w6 implements View.OnFocusChangeListener {
    public final int f13799a;
    public final KeyEvent.Callback f13800b;

    public w6(KeyEvent.Callback callback, int i3) {
        this.f13799a = i3;
        this.f13800b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f13799a) {
            case 0:
                if (z10) {
                    x6 x6Var = (x6) this.f13800b;
                    x6Var.f13845b2 = true;
                    ni.m mVar = new ni.m(x6Var.getContext(), 2);
                    mVar.f55704a = 1;
                    mVar.f20461p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(1.0f);
                    ((u4.b0) x6Var.f36102l1.getLayoutManager()).w0(mVar);
                    return;
                }
                return;
            case 1:
                SearchView searchView = (SearchView) this.f13800b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1375e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f13800b;
                h3Var.f29320n = z10;
                if (h3Var.h) {
                    h3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.f13800b;
                k3Var.f29490s = z10;
                if (k3Var.f29488n) {
                    k3Var.c();
                }
                k3Var.a(z10);
                return;
        }
    }
}
