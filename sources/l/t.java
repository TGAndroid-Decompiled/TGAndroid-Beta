package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f14038a;

    public t(v vVar) {
        this.f14038a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f14038a.c();
    }
}
