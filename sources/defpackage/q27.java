package defpackage;

import android.widget.PopupWindow;
public final class q27 implements PopupWindow.OnDismissListener {
    public final s27 a;

    public q27(s27 s27Var) {
        this.a = s27Var;
    }

    @Override
    public final void onDismiss() {
        this.a.c();
    }
}
