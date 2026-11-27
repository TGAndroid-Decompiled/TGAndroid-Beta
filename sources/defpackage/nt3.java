package defpackage;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.ActionBar.a;
public final class nt3 implements View.OnFocusChangeListener {
    public final byte a;
    public final KeyEvent.Callback b;

    public nt3(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                ot3 ot3Var = (ot3) callback;
                ot3Var.n = z;
                if (ot3Var.h) {
                    ot3Var.c();
                    return;
                }
                return;
            case 1:
                zt3 zt3Var = (zt3) callback;
                zt3Var.s = z;
                if (zt3Var.n) {
                    zt3Var.c();
                }
                zt3Var.a(z);
                return;
            case 2:
                SearchView searchView = (SearchView) callback;
                View.OnFocusChangeListener onFocusChangeListener = searchView.e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z);
                    return;
                }
                return;
            default:
                if (z) {
                    r1a r1aVar = (r1a) callback;
                    r1aVar.d2 = true;
                    z46 z46Var = new z46(r1aVar.getContext(), 2);
                    z46Var.a = 1;
                    z46Var.p = (a.getCurrentActionBarHeight() + hl.m) - hl.L(1.0f);
                    ((x46) r1aVar.n1.getLayoutManager()).v0(z46Var);
                    return;
                }
                return;
        }
    }
}
