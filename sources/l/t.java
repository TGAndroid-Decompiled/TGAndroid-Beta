package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15039a;

    public t(v vVar) {
        this.f15039a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15039a.c();
    }
}
