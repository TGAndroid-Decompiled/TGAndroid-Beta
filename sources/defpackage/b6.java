package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class b6 extends e6 {
    public final byte d = 1;
    public final FrameLayout e;

    public b6(aj3 aj3Var, Context context, yh4 yh4Var) {
        super(context, null, yh4Var);
        this.e = aj3Var;
    }

    @Override
    public final void e(m99 m99Var) {
        byte b = this.d;
        FrameLayout frameLayout = this.e;
        switch (b) {
            case 0:
                super.e(m99Var);
                float totalVisibility = getTotalVisibility();
                a6 a6Var = ((x20) frameLayout).G0;
                if (a6Var != null) {
                    a6Var.setTranslationY(totalVisibility * gm.L(-11.0f));
                    return;
                }
                return;
            default:
                super.e(m99Var);
                ((aj3) frameLayout).invalidate();
                return;
        }
    }

    public b6(x20 x20Var, Context context, ylb ylbVar, yh4 yh4Var) {
        super(context, ylbVar, yh4Var);
        this.e = x20Var;
    }
}
