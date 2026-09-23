package l;

import android.widget.PopupWindow;
public final class t implements PopupWindow.OnDismissListener {
    public final v f13776a;

    public t(v vVar) {
        this.f13776a = vVar;
    }

    @Override
    public final void onDismiss() {
        this.f13776a.c();
    }
}
