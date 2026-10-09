package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15291a;

    public t(v vVar) {
        this.f15291a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15291a.c();
    }
}
