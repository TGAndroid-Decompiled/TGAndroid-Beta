package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f15807a;

    public t(v vVar) {
        this.f15807a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f15807a.c();
    }
}
