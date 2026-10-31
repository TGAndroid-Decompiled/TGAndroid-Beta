package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f11551a;

    public u(w wVar) {
        this.f11551a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f11551a.c();
    }
}
