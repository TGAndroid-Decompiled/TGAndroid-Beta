package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class b6 extends e6 {
    public final byte d = 1;
    public final FrameLayout e;

    public b6(oh3 oh3Var, Context context, xf4 xf4Var) {
        super(context, null, xf4Var);
        this.e = oh3Var;
    }

    @Override
    public final void f(k79 k79Var) {
        byte b = this.d;
        FrameLayout frameLayout = this.e;
        switch (b) {
            case 0:
                super.f(k79Var);
                float totalVisibility = getTotalVisibility();
                a6 a6Var = ((x10) frameLayout).G0;
                if (a6Var != null) {
                    a6Var.setTranslationY(totalVisibility * gl.L(-11.0f));
                    return;
                }
                return;
            default:
                super.f(k79Var);
                ((oh3) frameLayout).invalidate();
                return;
        }
    }

    public b6(x10 x10Var, Context context, wjb wjbVar, xf4 xf4Var) {
        super(context, wjbVar, xf4Var);
        this.e = x10Var;
    }
}
