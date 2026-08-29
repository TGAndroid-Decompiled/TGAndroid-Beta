package bg;

import android.widget.PopupWindow;
import nh.t5;
import org.telegram.ui.Components.iv0;
public final class y implements PopupWindow.OnDismissListener {
    public final int f2612a;
    public final iv0 f2613b;

    public y(iv0 iv0Var, int i10) {
        this.f2612a = i10;
        this.f2613b = iv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f2612a) {
            case 0:
                ((g1) this.f2613b).O1.d();
                return;
            default:
                ((t5) this.f2613b).E1.d();
                return;
        }
    }
}
