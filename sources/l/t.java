package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15330a;

    public t(v vVar) {
        this.f15330a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15330a.c();
    }
}
