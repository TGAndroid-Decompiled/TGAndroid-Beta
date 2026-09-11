package di;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pv0;
public final class j5 implements PopupWindow.OnDismissListener {
    public final int f7436a;
    public final pv0 f7437b;

    public j5(pv0 pv0Var, int i10) {
        this.f7436a = i10;
        this.f7437b = pv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f7436a) {
            case 0:
                ((q6) this.f7437b).I1.d();
                return;
            default:
                ((rg.o0) this.f7437b).S1.d();
                return;
        }
    }
}
