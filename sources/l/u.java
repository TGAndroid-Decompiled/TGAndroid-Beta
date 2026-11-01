package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f11552a;

    public u(w wVar) {
        this.f11552a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f11552a.c();
    }
}
