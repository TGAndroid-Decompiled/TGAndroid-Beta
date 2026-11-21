package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f19261a;

    public t(v vVar) {
        this.f19261a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f19261a.c();
    }
}
