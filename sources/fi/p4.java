package fi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class p4 implements PopupWindow.OnDismissListener {
    public final int f12592a;
    public final FrameLayout f12593b;

    public p4(int i7, FrameLayout frameLayout) {
        this.f12592a = i7;
        this.f12593b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f12592a) {
            case 0:
                ((o5) this.f12593b).f12542r1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.o0 o0Var = ((org.telegram.ui.ActionBar.r0) this.f12593b).Q;
                if (o0Var != null) {
                    o0Var.i();
                    return;
                }
                return;
            default:
                ((tg.g0) this.f12593b).B1.d();
                return;
        }
    }
}
