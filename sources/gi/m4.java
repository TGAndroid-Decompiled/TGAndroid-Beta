package gi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class m4 implements PopupWindow.OnDismissListener {
    public final int f13194a;
    public final FrameLayout f13195b;

    public m4(int i3, FrameLayout frameLayout) {
        this.f13194a = i3;
        this.f13195b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f13194a) {
            case 0:
                ((m5) this.f13195b).f13228s1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.n0 n0Var = ((org.telegram.ui.ActionBar.q0) this.f13195b).R;
                if (n0Var != null) {
                    n0Var.e();
                    return;
                }
                return;
            default:
                ((ug.f0) this.f13195b).C1.d();
                return;
        }
    }
}
