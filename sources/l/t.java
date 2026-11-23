package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f19329a;

    public t(v vVar) {
        this.f19329a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f19329a.c();
    }
}
