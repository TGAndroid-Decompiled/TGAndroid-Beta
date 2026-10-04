package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15225a;

    public t(v vVar) {
        this.f15225a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15225a.c();
    }
}
