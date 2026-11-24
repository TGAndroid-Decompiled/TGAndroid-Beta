package defpackage;

import android.view.animation.OvershootInterpolator;
public abstract class rn {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final pn b = new pn("alpha", (byte) 0);
    public static final pm c;
    public static final pn d;
    public static final pn e;
    public static final pm f;
    public static final pm g;
    public static final pm h;

    static {
        new pn("color", (byte) 1);
        c = new pm("currentAlpha", (byte) 1);
        d = new pn("alpha", (byte) 2);
        e = new pn("alpha", (byte) 3);
        f = new pm("animationProgress", (byte) 2);
        g = new pm("animationValue", (byte) 3);
        h = new pm("clipProgress", (byte) 4);
    }
}
