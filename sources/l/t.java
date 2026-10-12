package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15040a;

    public t(v vVar) {
        this.f15040a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15040a.c();
    }
}
