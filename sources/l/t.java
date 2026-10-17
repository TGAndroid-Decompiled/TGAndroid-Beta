package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15801a;

    public t(v vVar) {
        this.f15801a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15801a.c();
    }
}
