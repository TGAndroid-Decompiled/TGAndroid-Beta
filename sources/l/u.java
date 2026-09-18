package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f13947a;

    public u(w wVar) {
        this.f13947a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f13947a.c();
    }
}
