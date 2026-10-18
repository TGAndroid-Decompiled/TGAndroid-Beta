package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15806a;

    public t(v vVar) {
        this.f15806a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15806a.c();
    }
}
