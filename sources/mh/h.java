package mh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.gr;
public abstract class h {
    public static final DecelerateInterpolator f13335a = new DecelerateInterpolator();
    public static final LinearInterpolator f13336b;
    public static final e f13337c;
    public static final e d;
    public static final e e;
    public static final e f13338f;
    public static final e f13339g;
    public static final e h;
    public static final e f13340i;
    public static final e f13341j;
    public static final e f13342k;
    public static final e f13343l;
    public static final e f13344m;
    public static final e f13345n;
    public static final e f13346o;
    public static final e f13347p;
    public static final e f13348q;
    public static final e f13349r;
    public static final e f13350s;
    public static final e f13351t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f13336b = linearInterpolator;
        f13337c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f13338f = j.i(new gr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f13339g = j.i(new gr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f13340i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        gr grVar = gr.h;
        f13341j = j.i(grVar, 0, 320, 560, false);
        f13342k = j.i(grVar, 40, 320, 560, false);
        f13343l = j.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f13344m = j.i(grVar, 0, 460, 560, false);
        f13345n = j.i(grVar, 0, 325, 560, false);
        f13346o = j.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f13347p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f13348q = j.i(grVar, 60, 320, 560, false);
        f13349r = j.i(grVar, 90, 380, 560, false);
        f13350s = j.i(grVar, 110, 440, 560, false);
        f13351t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
