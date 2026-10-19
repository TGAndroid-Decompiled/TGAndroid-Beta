package ei;

import android.widget.PopupWindow;
import org.telegram.ui.Components.lw0;
public final class z4 implements PopupWindow.OnDismissListener {
    public final int f10200a;
    public final lw0 f10201b;

    public z4(lw0 lw0Var, int i10) {
        this.f10200a = i10;
        this.f10201b = lw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f10200a) {
            case 0:
                ((f6) this.f10201b).I1.d();
                return;
            default:
                ((rg.m0) this.f10201b).S1.d();
                return;
        }
    }
}
