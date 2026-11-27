package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class c6 extends f6 {
    public final byte d = 1;
    public final FrameLayout e;

    public c6(ii3 ii3Var, Context context, vh4 vh4Var) {
        super(context, null, vh4Var);
        this.e = ii3Var;
    }

    @Override
    public final void f(xa9 xa9Var) {
        byte b = this.d;
        FrameLayout frameLayout = this.e;
        switch (b) {
            case 0:
                super.f(xa9Var);
                float totalVisibility = getTotalVisibility();
                b6 b6Var = ((y10) frameLayout).G0;
                if (b6Var != null) {
                    b6Var.setTranslationY(totalVisibility * hl.L(-11.0f));
                    return;
                }
                return;
            default:
                super.f(xa9Var);
                ((ii3) frameLayout).invalidate();
                return;
        }
    }

    public c6(y10 y10Var, Context context, vnb vnbVar, vh4 vh4Var) {
        super(context, vnbVar, vh4Var);
        this.e = y10Var;
    }
}
