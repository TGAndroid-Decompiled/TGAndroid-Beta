package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f12682a;

    public u(w wVar) {
        this.f12682a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f12682a.c();
    }
}
