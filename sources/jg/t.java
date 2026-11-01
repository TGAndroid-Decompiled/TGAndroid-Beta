package jg;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
import vh.b4;
public final class t implements PopupWindow.OnDismissListener {
    public final int f10231a;
    public final FrameLayout f10232b;

    public t(int i10, FrameLayout frameLayout) {
        this.f10231a = i10;
        this.f10232b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f10231a) {
            case 0:
                ((r0) this.f10232b).B1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = ((org.telegram.ui.ActionBar.t0) this.f10232b).Q;
                if (q0Var != null) {
                    q0Var.a();
                    return;
                }
                return;
            default:
                ((b4) this.f10232b).f50992r1.d();
                return;
        }
    }
}
