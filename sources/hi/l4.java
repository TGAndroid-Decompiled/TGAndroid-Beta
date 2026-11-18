package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class l4 implements PopupWindow.OnDismissListener {
    public final int f14891a;
    public final FrameLayout f14892b;

    public l4(int i7, FrameLayout frameLayout) {
        this.f14891a = i7;
        this.f14892b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f14891a) {
            case 0:
                ((l5) this.f14892b).f14925s1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.o0 o0Var = ((org.telegram.ui.ActionBar.r0) this.f14892b).R;
                if (o0Var != null) {
                    o0Var.j();
                    return;
                }
                return;
            default:
                ((tg.g0) this.f14892b).C1.d();
                return;
        }
    }
}
