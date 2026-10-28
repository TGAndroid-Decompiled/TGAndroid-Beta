package fi;

import android.widget.PopupWindow;
import org.telegram.ui.Components.xw0;
public final class y4 implements PopupWindow.OnDismissListener {
    public final int f11994a;
    public final xw0 f11995b;

    public y4(xw0 xw0Var, int i10) {
        this.f11994a = i10;
        this.f11995b = xw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f11994a) {
            case 0:
                ((e6) this.f11995b).f10822x1.d();
                return;
            default:
                ((sg.m0) this.f11995b).H1.d();
                return;
        }
    }
}
