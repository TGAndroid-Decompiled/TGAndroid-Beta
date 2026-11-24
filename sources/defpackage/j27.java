package defpackage;

import android.widget.PopupWindow;
public final class j27 implements PopupWindow.OnDismissListener {
    public final l27 a;

    public j27(l27 l27Var) {
        this.a = l27Var;
    }

    @Override
    public final void onDismiss() {
        this.a.c();
    }
}
