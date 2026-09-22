package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.dw0;
public final class j5 implements PopupWindow.OnDismissListener {
    public final int f4848a;
    public final dw0 f4849b;

    public j5(dw0 dw0Var, int i10) {
        this.f4848a = i10;
        this.f4849b = dw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4848a) {
            case 0:
                ((r6) this.f4849b).I1.d();
                return;
            default:
                ((qg.n0) this.f4849b).S1.d();
                return;
        }
    }
}
