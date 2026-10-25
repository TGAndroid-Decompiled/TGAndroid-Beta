package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f16773a;

    public t(v vVar) {
        this.f16773a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f16773a.c();
    }
}
