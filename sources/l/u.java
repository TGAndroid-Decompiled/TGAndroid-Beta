package l;

import android.widget.PopupWindow;
public final class u implements PopupWindow.OnDismissListener {
    public final w f15192a;

    public u(w wVar) {
        this.f15192a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f15192a.c();
    }
}
