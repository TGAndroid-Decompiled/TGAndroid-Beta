package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f15166a;

    public u(w wVar) {
        this.f15166a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f15166a.c();
    }
}
