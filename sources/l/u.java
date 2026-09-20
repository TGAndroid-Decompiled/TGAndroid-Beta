package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f13986a;

    public u(w wVar) {
        this.f13986a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f13986a.c();
    }
}
