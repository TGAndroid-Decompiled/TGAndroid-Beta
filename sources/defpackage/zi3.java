package defpackage;

import android.view.View;
public final class zi3 {
    public final byte a;
    public final aj3 b;
    public final View c;

    public zi3(aj3 aj3Var, View view, byte b) {
        this.a = b;
        this.b = aj3Var;
        this.c = view;
    }

    public final void a(boolean z) {
        byte b = this.a;
        View view = this.c;
        aj3 aj3Var = this.b;
        switch (b) {
            case 0:
                if (view instanceof hh3) {
                    aj3Var.P0.F0.i((hh3) view, false);
                    if (z) {
                        gm.d3(new jd((byte) 28), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (view instanceof hh3) {
                    aj3Var.P0.F0.i((hh3) view, false);
                    if (z) {
                        gm.d3(new jd((byte) 28), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
