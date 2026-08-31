package ih;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.pr;
public abstract class h {
    public static final DecelerateInterpolator f8136a = new DecelerateInterpolator();
    public static final LinearInterpolator f8137b;
    public static final e f8138c;
    public static final e d;
    public static final e f8139e;
    public static final e f8140f;
    public static final e f8141g;
    public static final e h;
    public static final e f8142i;
    public static final e f8143j;
    public static final e f8144k;
    public static final e f8145l;
    public static final e f8146m;
    public static final e f8147n;
    public static final e f8148o;
    public static final e f8149p;
    public static final e f8150q;
    public static final e f8151r;
    public static final e f8152s;
    public static final e f8153t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f8137b = linearInterpolator;
        f8138c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        f8139e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f8140f = j.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f8141g = j.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f8142i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        pr prVar = pr.h;
        f8143j = j.i(prVar, 0, 320, 560, false);
        f8144k = j.i(prVar, 40, 320, 560, false);
        f8145l = j.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f8146m = j.i(prVar, 0, 460, 560, false);
        f8147n = j.i(prVar, 0, 325, 560, false);
        f8148o = j.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f8149p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f8150q = j.i(prVar, 60, 320, 560, false);
        f8151r = j.i(prVar, 90, 380, 560, false);
        f8152s = j.i(prVar, 110, 440, 560, false);
        f8153t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
