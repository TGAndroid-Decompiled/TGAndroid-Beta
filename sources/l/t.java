package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f16772a;

    public t(v vVar) {
        this.f16772a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f16772a.c();
    }
}
