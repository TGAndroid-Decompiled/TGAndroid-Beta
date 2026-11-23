package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f19230a;

    public t(v vVar) {
        this.f19230a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f19230a.c();
    }
}
