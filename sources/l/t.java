package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15808a;

    public t(v vVar) {
        this.f15808a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15808a.c();
    }
}
