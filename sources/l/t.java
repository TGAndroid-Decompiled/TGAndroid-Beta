package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f14467a;

    public t(v vVar) {
        this.f14467a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f14467a.c();
    }
}
