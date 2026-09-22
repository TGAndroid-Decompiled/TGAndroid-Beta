package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f13788a;

    public t(v vVar) {
        this.f13788a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f13788a.c();
    }
}
