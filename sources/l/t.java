package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f13800a;

    public t(v vVar) {
        this.f13800a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f13800a.c();
    }
}
