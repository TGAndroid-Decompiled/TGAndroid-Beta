package di;

import android.widget.PopupWindow;
import org.telegram.ui.Components.pv0;
public final class j5 implements PopupWindow.OnDismissListener {
    public final int f7464a;
    public final pv0 f7465b;

    public j5(pv0 pv0Var, int i10) {
        this.f7464a = i10;
        this.f7465b = pv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f7464a) {
            case 0:
                ((q6) this.f7465b).I1.d();
                return;
            default:
                ((rg.o0) this.f7465b).S1.d();
                return;
        }
    }
}
