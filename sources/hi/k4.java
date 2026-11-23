package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class k4 implements PopupWindow.OnDismissListener {
    public final int f14869a;
    public final FrameLayout f14870b;

    public k4(int i7, FrameLayout frameLayout) {
        this.f14869a = i7;
        this.f14870b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f14869a) {
            case 0:
                ((k5) this.f14870b).f14903s1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.n0 n0Var = ((org.telegram.ui.ActionBar.q0) this.f14870b).R;
                if (n0Var != null) {
                    n0Var.j();
                    return;
                }
                return;
            default:
                ((tg.h0) this.f14870b).C1.d();
                return;
        }
    }
}
