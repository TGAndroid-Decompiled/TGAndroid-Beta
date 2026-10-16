package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f14469a;

    public t(v vVar) {
        this.f14469a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f14469a.c();
    }
}
