package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f13997a;

    public u(w wVar) {
        this.f13997a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f13997a.c();
    }
}
