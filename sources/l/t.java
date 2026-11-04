package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f17473a;

    public t(v vVar) {
        this.f17473a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f17473a.c();
    }
}
