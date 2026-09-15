package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.qv0;
public final class j5 implements PopupWindow.OnDismissListener {
    public final int f4844a;
    public final qv0 f4845b;

    public j5(qv0 qv0Var, int i10) {
        this.f4844a = i10;
        this.f4845b = qv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4844a) {
            case 0:
                ((r6) this.f4845b).I1.d();
                return;
            default:
                ((qg.p0) this.f4845b).S1.d();
                return;
        }
    }
}
