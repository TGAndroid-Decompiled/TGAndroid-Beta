package ei;

import android.widget.PopupWindow;
import org.telegram.ui.Components.kw0;
public final class z4 implements PopupWindow.OnDismissListener {
    public final int f10199a;
    public final kw0 f10200b;

    public z4(kw0 kw0Var, int i10) {
        this.f10199a = i10;
        this.f10200b = kw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f10199a) {
            case 0:
                ((f6) this.f10200b).I1.d();
                return;
            default:
                ((rg.m0) this.f10200b).S1.d();
                return;
        }
    }
}
