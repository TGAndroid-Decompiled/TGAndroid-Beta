package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.ew0;
public final class i5 implements PopupWindow.OnDismissListener {
    public final int f4791a;
    public final ew0 f4792b;

    public i5(ew0 ew0Var, int i10) {
        this.f4791a = i10;
        this.f4792b = ew0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4791a) {
            case 0:
                ((q6) this.f4792b).I1.d();
                return;
            default:
                ((qg.n0) this.f4792b).S1.d();
                return;
        }
    }
}
