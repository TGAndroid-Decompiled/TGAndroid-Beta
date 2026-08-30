package hh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.nr;
public abstract class h {
    public static final DecelerateInterpolator f7136a = new DecelerateInterpolator();
    public static final LinearInterpolator f7137b;
    public static final e f7138c;
    public static final e d;
    public static final e e;
    public static final e f7139f;
    public static final e f7140g;
    public static final e h;
    public static final e f7141i;
    public static final e f7142j;
    public static final e f7143k;
    public static final e f7144l;
    public static final e f7145m;
    public static final e f7146n;
    public static final e f7147o;
    public static final e f7148p;
    public static final e f7149q;
    public static final e f7150r;
    public static final e f7151s;
    public static final e f7152t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f7137b = linearInterpolator;
        f7138c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f7139f = j.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f7140g = j.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f7141i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        nr nrVar = nr.h;
        f7142j = j.i(nrVar, 0, 320, 560, false);
        f7143k = j.i(nrVar, 40, 320, 560, false);
        f7144l = j.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f7145m = j.i(nrVar, 0, 460, 560, false);
        f7146n = j.i(nrVar, 0, 325, 560, false);
        f7147o = j.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f7148p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f7149q = j.i(nrVar, 60, 320, 560, false);
        f7150r = j.i(nrVar, 90, 380, 560, false);
        f7151s = j.i(nrVar, 110, 440, 560, false);
        f7152t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
