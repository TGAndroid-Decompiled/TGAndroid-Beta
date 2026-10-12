package di;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pw0;
public final class h5 implements PopupWindow.OnDismissListener {
    public final int f7001a;
    public final pw0 f7002b;

    public h5(pw0 pw0Var, int i10) {
        this.f7001a = i10;
        this.f7002b = pw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f7001a) {
            case 0:
                ((o6) this.f7002b).I1.d();
                return;
            default:
                ((rg.o0) this.f7002b).S1.d();
                return;
        }
    }
}
