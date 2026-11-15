package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class m4 implements PopupWindow.OnDismissListener {
    public final int f14655a;
    public final FrameLayout f14656b;

    public m4(int i7, FrameLayout frameLayout) {
        this.f14655a = i7;
        this.f14656b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f14655a) {
            case 0:
                ((m5) this.f14656b).f14689s1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.n0 n0Var = ((org.telegram.ui.ActionBar.q0) this.f14656b).R;
                if (n0Var != null) {
                    n0Var.i();
                    return;
                }
                return;
            default:
                ((tg.g0) this.f14656b).C1.d();
                return;
        }
    }
}
