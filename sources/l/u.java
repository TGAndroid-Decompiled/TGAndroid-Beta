package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f14013a;

    public u(w wVar) {
        this.f14013a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f14013a.c();
    }
}
