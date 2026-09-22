package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f14000a;

    public u(w wVar) {
        this.f14000a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f14000a.c();
    }
}
