package hh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.mr;
public abstract class h {
    public static final DecelerateInterpolator f7119a = new DecelerateInterpolator();
    public static final LinearInterpolator f7120b;
    public static final e f7121c;
    public static final e d;
    public static final e e;
    public static final e f7122f;
    public static final e f7123g;
    public static final e h;
    public static final e f7124i;
    public static final e f7125j;
    public static final e f7126k;
    public static final e f7127l;
    public static final e f7128m;
    public static final e f7129n;
    public static final e f7130o;
    public static final e f7131p;
    public static final e f7132q;
    public static final e f7133r;
    public static final e f7134s;
    public static final e f7135t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f7120b = linearInterpolator;
        f7121c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f7122f = j.i(new mr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f7123g = j.i(new mr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f7124i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        mr mrVar = mr.h;
        f7125j = j.i(mrVar, 0, 320, 560, false);
        f7126k = j.i(mrVar, 40, 320, 560, false);
        f7127l = j.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f7128m = j.i(mrVar, 0, 460, 560, false);
        f7129n = j.i(mrVar, 0, 325, 560, false);
        f7130o = j.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f7131p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f7132q = j.i(mrVar, 60, 320, 560, false);
        f7133r = j.i(mrVar, 90, 380, 560, false);
        f7134s = j.i(mrVar, 110, 440, 560, false);
        f7135t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
