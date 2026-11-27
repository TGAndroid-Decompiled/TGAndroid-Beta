package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public final class h38 implements nr7, fd {
    public final byte a;
    public final h48 b;

    public h38(h48 h48Var, byte b) {
        this.a = b;
        this.b = h48Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        mq5 H0 = hl.H0(l2dVar, false);
        h48 h48Var = this.b;
        h48Var.c0 = H0;
        p38 p38Var = h48Var.h.b;
        int i = H0.a;
        int paddingTop = p38Var.getPaddingTop();
        mq5 mq5Var = h48Var.c0;
        p38Var.setPadding(i, paddingTop, mq5Var.c, hl.L(72.0f) + mq5Var.d);
        p38 p38Var2 = h48Var.n.b;
        int i2 = h48Var.c0.a;
        int paddingTop2 = p38Var2.getPaddingTop();
        mq5 mq5Var2 = h48Var.c0;
        p38Var2.setPadding(i2, paddingTop2, mq5Var2.c, hl.L(72.0f) + mq5Var2.d);
        FrameLayout frameLayout = h48Var.Q;
        mq5 mq5Var3 = h48Var.c0;
        frameLayout.setPadding(mq5Var3.a, 0, mq5Var3.c, mq5Var3.d);
        return l2d.b;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        h48 h48Var = this.b;
        switch (b) {
            case 1:
                h48Var.finishFragment();
                return;
            default:
                h48Var.B0();
                return;
        }
    }
}
