package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f14028a;

    public u(w wVar) {
        this.f14028a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f14028a.c();
    }
}
