package defpackage;

import android.view.animation.OvershootInterpolator;
public abstract class so {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final qo b = new qo("alpha", (byte) 0);
    public static final pn c;
    public static final qo d;
    public static final qo e;
    public static final pn f;
    public static final pn g;
    public static final pn h;

    static {
        new qo("color", (byte) 1);
        c = new pn("currentAlpha", (byte) 1);
        d = new qo("alpha", (byte) 2);
        e = new qo("alpha", (byte) 3);
        f = new pn("animationProgress", (byte) 2);
        g = new pn("animationValue", (byte) 3);
        h = new pn("clipProgress", (byte) 4);
    }
}
