package fi;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
public final class v6 implements View.OnFocusChangeListener {
    public final int f12927a;
    public final KeyEvent.Callback f12928b;

    public v6(KeyEvent.Callback callback, int i7) {
        this.f12927a = i7;
        this.f12928b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        switch (this.f12927a) {
            case 0:
                if (z9) {
                    w6 w6Var = (w6) this.f12928b;
                    w6Var.f13033a2 = true;
                    mi.m mVar = new mi.m(w6Var.getContext(), 2);
                    mVar.f57213a = 1;
                    mVar.f20111p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(1.0f);
                    ((v4.b0) w6Var.f36277k1.getLayoutManager()).w0(mVar);
                    return;
                }
                return;
            case 1:
                SearchView searchView = (SearchView) this.f12928b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1952d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z9);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f12928b;
                h3Var.f29256n = z9;
                if (h3Var.h) {
                    h3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.f12928b;
                k3Var.f29416s = z9;
                if (k3Var.f29414n) {
                    k3Var.c();
                }
                k3Var.a(z9);
                return;
        }
    }
}
