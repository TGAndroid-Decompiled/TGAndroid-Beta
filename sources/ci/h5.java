package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.uw0;
public final class h5 implements PopupWindow.OnDismissListener {
    public final int f5167a;
    public final uw0 f5168b;

    public h5(uw0 uw0Var, int i10) {
        this.f5167a = i10;
        this.f5168b = uw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f5167a) {
            case 0:
                ((q6) this.f5168b).I1.d();
                return;
            default:
                ((qg.m0) this.f5168b).S1.d();
                return;
        }
    }
}
