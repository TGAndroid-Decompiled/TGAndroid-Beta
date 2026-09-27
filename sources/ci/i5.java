package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.dw0;
public final class i5 implements PopupWindow.OnDismissListener {
    public final int f4785a;
    public final dw0 f4786b;

    public i5(dw0 dw0Var, int i10) {
        this.f4785a = i10;
        this.f4786b = dw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4785a) {
            case 0:
                ((q6) this.f4786b).I1.d();
                return;
            default:
                ((qg.m0) this.f4786b).S1.d();
                return;
        }
    }
}
