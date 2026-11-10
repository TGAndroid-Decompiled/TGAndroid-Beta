package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f17730a;

    public t(v vVar) {
        this.f17730a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f17730a.c();
    }
}
