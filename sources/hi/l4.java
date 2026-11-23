package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class l4 implements PopupWindow.OnDismissListener {
    public final int f14881a;
    public final FrameLayout f14882b;

    public l4(int i7, FrameLayout frameLayout) {
        this.f14881a = i7;
        this.f14882b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f14881a) {
            case 0:
                ((l5) this.f14882b).f14915s1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.n0 n0Var = ((org.telegram.ui.ActionBar.q0) this.f14882b).R;
                if (n0Var != null) {
                    n0Var.j();
                    return;
                }
                return;
            default:
                ((tg.h0) this.f14882b).C1.d();
                return;
        }
    }
}
