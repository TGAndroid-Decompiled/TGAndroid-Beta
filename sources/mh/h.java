package mh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.gr;
public abstract class h {
    public static final DecelerateInterpolator f13334a = new DecelerateInterpolator();
    public static final LinearInterpolator f13335b;
    public static final e f13336c;
    public static final e d;
    public static final e e;
    public static final e f13337f;
    public static final e f13338g;
    public static final e h;
    public static final e f13339i;
    public static final e f13340j;
    public static final e f13341k;
    public static final e f13342l;
    public static final e f13343m;
    public static final e f13344n;
    public static final e f13345o;
    public static final e f13346p;
    public static final e f13347q;
    public static final e f13348r;
    public static final e f13349s;
    public static final e f13350t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f13335b = linearInterpolator;
        f13336c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f13337f = j.i(new gr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f13338g = j.i(new gr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f13339i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        gr grVar = gr.h;
        f13340j = j.i(grVar, 0, 320, 560, false);
        f13341k = j.i(grVar, 40, 320, 560, false);
        f13342l = j.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f13343m = j.i(grVar, 0, 460, 560, false);
        f13344n = j.i(grVar, 0, 325, 560, false);
        f13345o = j.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f13346p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f13347q = j.i(grVar, 60, 320, 560, false);
        f13348r = j.i(grVar, 90, 380, 560, false);
        f13349s = j.i(grVar, 110, 440, 560, false);
        f13350t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
