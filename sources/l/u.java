package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f14012a;

    public u(w wVar) {
        this.f14012a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f14012a.c();
    }
}
