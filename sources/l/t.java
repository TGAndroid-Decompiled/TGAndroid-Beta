package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15295a;

    public t(v vVar) {
        this.f15295a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15295a.c();
    }
}
