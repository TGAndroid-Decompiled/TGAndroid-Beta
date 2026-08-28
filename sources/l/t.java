package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f16610a;

    public t(v vVar) {
        this.f16610a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f16610a.c();
    }
}
