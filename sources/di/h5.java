package di;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pw0;
public final class h5 implements PopupWindow.OnDismissListener {
    public final int f7004a;
    public final pw0 f7005b;

    public h5(pw0 pw0Var, int i10) {
        this.f7004a = i10;
        this.f7005b = pw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f7004a) {
            case 0:
                ((o6) this.f7005b).I1.d();
                return;
            default:
                ((rg.o0) this.f7005b).S1.d();
                return;
        }
    }
}
