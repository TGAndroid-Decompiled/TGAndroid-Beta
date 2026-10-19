package ei;

import android.widget.PopupWindow;
import org.telegram.ui.Components.lw0;
public final class z4 implements PopupWindow.OnDismissListener {
    public final int f10198a;
    public final lw0 f10199b;

    public z4(lw0 lw0Var, int i10) {
        this.f10198a = i10;
        this.f10199b = lw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f10198a) {
            case 0:
                ((f6) this.f10199b).I1.d();
                return;
            default:
                ((rg.m0) this.f10199b).S1.d();
                return;
        }
    }
}
