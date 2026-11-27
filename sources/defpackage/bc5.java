package defpackage;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class bc5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout a;
    public final dc5 b;

    public bc5(dc5 dc5Var, FrameLayout frameLayout) {
        this.b = dc5Var;
        this.a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        dc5 dc5Var = this.b;
        ph1 ph1Var = dc5Var.A0;
        if (ph1Var == null) {
            ph1Var = (ph1) dc5Var.C0(dc5Var.a0);
            dc5Var.A0 = ph1Var;
        }
        ph1Var.f.setOnClickListener(new sa5(this, (byte) 4));
    }
}
