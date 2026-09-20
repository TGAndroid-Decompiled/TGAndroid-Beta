package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.bw0;
public final class j5 implements PopupWindow.OnDismissListener {
    public final int f4850a;
    public final bw0 f4851b;

    public j5(bw0 bw0Var, int i10) {
        this.f4850a = i10;
        this.f4851b = bw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4850a) {
            case 0:
                ((r6) this.f4851b).I1.d();
                return;
            default:
                ((qg.n0) this.f4851b).S1.d();
                return;
        }
    }
}
