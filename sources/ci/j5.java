package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.cw0;
public final class j5 implements PopupWindow.OnDismissListener {
    public final int f4849a;
    public final cw0 f4850b;

    public j5(cw0 cw0Var, int i10) {
        this.f4849a = i10;
        this.f4850b = cw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4849a) {
            case 0:
                ((r6) this.f4850b).I1.d();
                return;
            default:
                ((qg.m0) this.f4850b).S1.d();
                return;
        }
    }
}
