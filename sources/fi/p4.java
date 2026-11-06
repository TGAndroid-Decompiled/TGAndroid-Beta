package fi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class p4 implements PopupWindow.OnDismissListener {
    public final int f12594a;
    public final FrameLayout f12595b;

    public p4(int i7, FrameLayout frameLayout) {
        this.f12594a = i7;
        this.f12595b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f12594a) {
            case 0:
                ((o5) this.f12595b).f12544r1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.o0 o0Var = ((org.telegram.ui.ActionBar.r0) this.f12595b).Q;
                if (o0Var != null) {
                    o0Var.i();
                    return;
                }
                return;
            default:
                ((tg.g0) this.f12595b).B1.d();
                return;
        }
    }
}
