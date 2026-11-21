package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class k4 implements PopupWindow.OnDismissListener {
    public final int f14866a;
    public final FrameLayout f14867b;

    public k4(int i7, FrameLayout frameLayout) {
        this.f14866a = i7;
        this.f14867b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f14866a) {
            case 0:
                ((k5) this.f14867b).f14900s1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.n0 n0Var = ((org.telegram.ui.ActionBar.q0) this.f14867b).R;
                if (n0Var != null) {
                    n0Var.j();
                    return;
                }
                return;
            default:
                ((tg.h0) this.f14867b).C1.d();
                return;
        }
    }
}
