package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15870a;

    public t(v vVar) {
        this.f15870a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15870a.c();
    }
}
