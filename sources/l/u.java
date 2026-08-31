package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f11451a;

    public u(w wVar) {
        this.f11451a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f11451a.c();
    }
}
