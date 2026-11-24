package defpackage;

import android.widget.PopupWindow;
public final class j07 implements PopupWindow.OnDismissListener {
    public final l07 a;

    public j07(l07 l07Var) {
        this.a = l07Var;
    }

    @Override
    public final void onDismiss() {
        this.a.c();
    }
}
