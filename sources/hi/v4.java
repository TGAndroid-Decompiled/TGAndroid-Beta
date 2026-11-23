package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class v4 implements PopupWindow.OnDismissListener {
    public final int f15551a;
    public final FrameLayout f15552b;

    public v4(int i7, FrameLayout frameLayout) {
        this.f15551a = i7;
        this.f15552b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f15551a) {
            case 0:
                ((v5) this.f15552b).f15589s1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.n0 n0Var = ((org.telegram.ui.ActionBar.q0) this.f15552b).R;
                if (n0Var != null) {
                    n0Var.a();
                    return;
                }
                return;
            default:
                ((tg.l0) this.f15552b).C1.d();
                return;
        }
    }
}
