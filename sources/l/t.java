package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f13790a;

    public t(v vVar) {
        this.f13790a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f13790a.c();
    }
}
