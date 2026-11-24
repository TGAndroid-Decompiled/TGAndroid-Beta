package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public abstract class vz8 {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final LinearInterpolator b;
    public static final uz8 c;
    public static final uz8 d;
    public static final uz8 e;
    public static final uz8 f;
    public static final uz8 g;
    public static final uz8 h;
    public static final uz8 i;
    public static final uz8 j;
    public static final uz8 k;
    public static final uz8 l;
    public static final uz8 m;
    public static final uz8 n;
    public static final uz8 o;
    public static final uz8 p;
    public static final uz8 q;
    public static final uz8 r;
    public static final uz8 s;
    public static final uz8 t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        b = linearInterpolator;
        c = wz8.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = wz8.i(linearInterpolator, 0, 240, 240, false);
        e = wz8.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f = wz8.i(new d53(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        g = wz8.i(new d53(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = wz8.i(new DecelerateInterpolator(), 0, 150, 560, false);
        i = wz8.i(new DecelerateInterpolator(), 210, 425, 560, false);
        d53 d53Var = d53.h;
        j = wz8.i(d53Var, 0, 320, 560, false);
        k = wz8.i(d53Var, 40, 320, 560, false);
        l = wz8.i(new DecelerateInterpolator(), 0, 250, 560, false);
        m = wz8.i(d53Var, 0, 460, 560, false);
        n = wz8.i(d53Var, 0, 325, 560, false);
        o = wz8.i(new DecelerateInterpolator(), 150, 250, 560, false);
        p = wz8.i(new DecelerateInterpolator(), 200, 480, 560, false);
        q = wz8.i(d53Var, 60, 320, 560, false);
        r = wz8.i(d53Var, 90, 380, 560, false);
        s = wz8.i(d53Var, 110, 440, 560, false);
        t = wz8.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
