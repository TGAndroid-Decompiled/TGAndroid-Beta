package hi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class l4 implements PopupWindow.OnDismissListener {
    public final int f14894a;
    public final FrameLayout f14895b;

    public l4(int i7, FrameLayout frameLayout) {
        this.f14894a = i7;
        this.f14895b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f14894a) {
            case 0:
                ((l5) this.f14895b).f14928s1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.o0 o0Var = ((org.telegram.ui.ActionBar.r0) this.f14895b).R;
                if (o0Var != null) {
                    o0Var.j();
                    return;
                }
                return;
            default:
                ((tg.g0) this.f14895b).C1.d();
                return;
        }
    }
}
