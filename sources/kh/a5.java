package kh;

import android.widget.PopupWindow;
import org.telegram.ui.Components.yu0;
public final class a5 implements PopupWindow.OnDismissListener {
    public final int f14892a;
    public final yu0 f14893b;

    public a5(yu0 yu0Var, int i9) {
        this.f14892a = i9;
        this.f14893b = yu0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f14892a) {
            case 0:
                ((g6) this.f14893b).E1.d();
                return;
            default:
                ((yf.l0) this.f14893b).O1.d();
                return;
        }
    }
}
