package ei;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pw0;
public final class z4 implements PopupWindow.OnDismissListener {
    public final int f10215a;
    public final pw0 f10216b;

    public z4(pw0 pw0Var, int i10) {
        this.f10215a = i10;
        this.f10216b = pw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f10215a) {
            case 0:
                ((f6) this.f10216b).I1.d();
                return;
            default:
                ((rg.m0) this.f10216b).S1.d();
                return;
        }
    }
}
