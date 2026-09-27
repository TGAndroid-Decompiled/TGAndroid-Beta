package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f14014a;

    public u(w wVar) {
        this.f14014a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f14014a.c();
    }
}
