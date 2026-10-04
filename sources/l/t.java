package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15226a;

    public t(v vVar) {
        this.f15226a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15226a.c();
    }
}
