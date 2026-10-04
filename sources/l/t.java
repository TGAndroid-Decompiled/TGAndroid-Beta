package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15227a;

    public t(v vVar) {
        this.f15227a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15227a.c();
    }
}
