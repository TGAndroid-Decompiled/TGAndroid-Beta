package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f11094a;

    public t(v vVar) {
        this.f11094a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f11094a.c();
    }
}
