package ei;

import android.widget.PopupWindow;
import org.telegram.ui.Components.ow0;
public final class z4 implements PopupWindow.OnDismissListener {
    public final int f10215a;
    public final ow0 f10216b;

    public z4(ow0 ow0Var, int i10) {
        this.f10215a = i10;
        this.f10216b = ow0Var;
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
