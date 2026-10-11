package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15294a;

    public t(v vVar) {
        this.f15294a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15294a.c();
    }
}
