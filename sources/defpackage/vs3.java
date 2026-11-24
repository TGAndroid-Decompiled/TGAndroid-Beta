package defpackage;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.ActionBar.a;
public final class vs3 implements View.OnFocusChangeListener {
    public final byte a;
    public final KeyEvent.Callback b;

    public vs3(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                ws3 ws3Var = (ws3) callback;
                ws3Var.n = z;
                if (ws3Var.h) {
                    ws3Var.c();
                    return;
                }
                return;
            case 1:
                it3 it3Var = (it3) callback;
                it3Var.s = z;
                if (it3Var.n) {
                    it3Var.c();
                }
                it3Var.a(z);
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
                    yx9 yx9Var = (yx9) callback;
                    yx9Var.d2 = true;
                    v26 v26Var = new v26(yx9Var.getContext(), 2);
                    v26Var.a = 1;
                    v26Var.p = (a.getCurrentActionBarHeight() + gl.m) - gl.L(1.0f);
                    ((t26) yx9Var.n1.getLayoutManager()).v0(v26Var);
                    return;
                }
                return;
        }
    }
}
