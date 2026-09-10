package bi;

import android.widget.PopupWindow;
import org.telegram.ui.Components.bw0;
public final class f6 implements PopupWindow.OnDismissListener {
    public final int f2713a;
    public final bw0 f2714b;

    public f6(bw0 bw0Var, int i10) {
        this.f2713a = i10;
        this.f2714b = bw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f2713a) {
            case 0:
                ((r7) this.f2714b).I1.d();
                return;
            default:
                ((pg.m0) this.f2714b).S1.d();
                return;
        }
    }
}
