package eg;

import android.widget.PopupWindow;
import org.telegram.ui.Components.sv0;
import qh.b5;
public final class w implements PopupWindow.OnDismissListener {
    public final int f5522a;
    public final sv0 f5523b;

    public w(sv0 sv0Var, int i10) {
        this.f5522a = i10;
        this.f5523b = sv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f5522a) {
            case 0:
                ((c1) this.f5523b).P1.d();
                return;
            default:
                ((b5) this.f5523b).F1.d();
                return;
        }
    }
}
