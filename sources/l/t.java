package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f18869a;

    public t(v vVar) {
        this.f18869a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f18869a.c();
    }
}
