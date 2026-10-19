package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15809a;

    public t(v vVar) {
        this.f15809a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15809a.c();
    }
}
