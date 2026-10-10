package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.uw0;
public final class h5 implements PopupWindow.OnDismissListener {
    public final int f5168a;
    public final uw0 f5169b;

    public h5(uw0 uw0Var, int i10) {
        this.f5168a = i10;
        this.f5169b = uw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f5168a) {
            case 0:
                ((q6) this.f5169b).I1.d();
                return;
            default:
                ((qg.m0) this.f5169b).S1.d();
                return;
        }
    }
}
