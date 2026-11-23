package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f19264a;

    public t(v vVar) {
        this.f19264a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f19264a.c();
    }
}
