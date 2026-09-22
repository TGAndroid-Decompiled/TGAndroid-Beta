package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.qv0;
public final class j5 implements PopupWindow.OnDismissListener {
    public final int f4846a;
    public final qv0 f4847b;

    public j5(qv0 qv0Var, int i10) {
        this.f4846a = i10;
        this.f4847b = qv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4846a) {
            case 0:
                ((r6) this.f4847b).I1.d();
                return;
            default:
                ((qg.p0) this.f4847b).S1.d();
                return;
        }
    }
}
