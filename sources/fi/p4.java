package fi;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class p4 implements PopupWindow.OnDismissListener {
    public final int f12596a;
    public final FrameLayout f12597b;

    public p4(int i7, FrameLayout frameLayout) {
        this.f12596a = i7;
        this.f12597b = frameLayout;
    }

    @Override
    public final void onDismiss() {
        switch (this.f12596a) {
            case 0:
                ((o5) this.f12597b).f12546r1.d();
                return;
            case 1:
                org.telegram.ui.ActionBar.o0 o0Var = ((org.telegram.ui.ActionBar.r0) this.f12597b).Q;
                if (o0Var != null) {
                    o0Var.i();
                    return;
                }
                return;
            default:
                ((tg.g0) this.f12597b).B1.d();
                return;
        }
    }
}
