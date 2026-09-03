package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f11204a;

    public t(v vVar) {
        this.f11204a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f11204a.c();
    }
}
