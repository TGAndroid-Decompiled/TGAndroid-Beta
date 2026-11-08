package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f17727a;

    public t(v vVar) {
        this.f17727a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f17727a.c();
    }
}
