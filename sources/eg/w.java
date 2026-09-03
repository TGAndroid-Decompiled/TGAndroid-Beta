package eg;

import android.widget.PopupWindow;
import org.telegram.ui.Components.rv0;
import qh.a5;
public final class w implements PopupWindow.OnDismissListener {
    public final int f5522a;
    public final rv0 f5523b;

    public w(rv0 rv0Var, int i10) {
        this.f5522a = i10;
        this.f5523b = rv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f5522a) {
            case 0:
                ((c1) this.f5523b).P1.d();
                return;
            default:
                ((a5) this.f5523b).F1.d();
                return;
        }
    }
}
