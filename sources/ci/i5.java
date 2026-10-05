package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.nw0;
public final class i5 implements PopupWindow.OnDismissListener {
    public final int f5169a;
    public final nw0 f5170b;

    public i5(nw0 nw0Var, int i10) {
        this.f5169a = i10;
        this.f5170b = nw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f5169a) {
            case 0:
                ((q6) this.f5170b).I1.d();
                return;
            default:
                ((qg.m0) this.f5170b).S1.d();
                return;
        }
    }
}
