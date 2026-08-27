package l;

import android.widget.PopupWindow;

public final class u implements PopupWindow.OnDismissListener {

    public final w f15366a;

    public u(w wVar) {
        this.f15366a = wVar;
    }

    @Override
    public final void onDismiss() {
        this.f15366a.c();
    }
}
