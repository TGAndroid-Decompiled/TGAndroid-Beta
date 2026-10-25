package fi;

import android.widget.PopupWindow;
import org.telegram.ui.Components.ww0;
public final class y4 implements PopupWindow.OnDismissListener {
    public final int f11995a;
    public final ww0 f11996b;

    public y4(ww0 ww0Var, int i10) {
        this.f11995a = i10;
        this.f11996b = ww0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f11995a) {
            case 0:
                ((e6) this.f11996b).f10823x1.d();
                return;
            default:
                ((sg.n0) this.f11996b).H1.d();
                return;
        }
    }
}
