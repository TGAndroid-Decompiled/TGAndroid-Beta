package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f17724a;

    public t(v vVar) {
        this.f17724a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f17724a.c();
    }
}
