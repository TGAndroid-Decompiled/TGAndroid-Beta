package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public abstract class ux8 {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final LinearInterpolator b;
    public static final tx8 c;
    public static final tx8 d;
    public static final tx8 e;
    public static final tx8 f;
    public static final tx8 g;
    public static final tx8 h;
    public static final tx8 i;
    public static final tx8 j;
    public static final tx8 k;
    public static final tx8 l;
    public static final tx8 m;
    public static final tx8 n;
    public static final tx8 o;
    public static final tx8 p;
    public static final tx8 q;
    public static final tx8 r;
    public static final tx8 s;
    public static final tx8 t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        b = linearInterpolator;
        c = vx8.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = vx8.i(linearInterpolator, 0, 240, 240, false);
        e = vx8.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f = vx8.i(new s33(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        g = vx8.i(new s33(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = vx8.i(new DecelerateInterpolator(), 0, 150, 560, false);
        i = vx8.i(new DecelerateInterpolator(), 210, 425, 560, false);
        s33 s33Var = s33.h;
        j = vx8.i(s33Var, 0, 320, 560, false);
        k = vx8.i(s33Var, 40, 320, 560, false);
        l = vx8.i(new DecelerateInterpolator(), 0, 250, 560, false);
        m = vx8.i(s33Var, 0, 460, 560, false);
        n = vx8.i(s33Var, 0, 325, 560, false);
        o = vx8.i(new DecelerateInterpolator(), 150, 250, 560, false);
        p = vx8.i(new DecelerateInterpolator(), 200, 480, 560, false);
        q = vx8.i(s33Var, 60, 320, 560, false);
        r = vx8.i(s33Var, 90, 380, 560, false);
        s = vx8.i(s33Var, 110, 440, 560, false);
        t = vx8.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
