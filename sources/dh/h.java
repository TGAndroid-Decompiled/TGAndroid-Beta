package dh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.er;

public abstract class h {

    public static final DecelerateInterpolator f4999a = new DecelerateInterpolator();

    public static final LinearInterpolator f5000b;

    public static final e f5001c;
    public static final e d;

    public static final e f5002e;

    public static final e f5003f;

    public static final e f5004g;
    public static final e h;

    public static final e f5005i;

    public static final e f5006j;

    public static final e f5007k;

    public static final e f5008l;

    public static final e f5009m;

    public static final e f5010n;

    public static final e f5011o;

    public static final e f5012p;

    public static final e f5013q;

    public static final e f5014r;

    public static final e f5015s;

    public static final e f5016t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f5000b = linearInterpolator;
        f5001c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        f5002e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f5003f = j.i(new er(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f5004g = j.i(new er(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f5005i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        er erVar = er.h;
        f5006j = j.i(erVar, 0, 320, 560, false);
        f5007k = j.i(erVar, 40, 320, 560, false);
        f5008l = j.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f5009m = j.i(erVar, 0, 460, 560, false);
        f5010n = j.i(erVar, 0, 325, 560, false);
        f5011o = j.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f5012p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f5013q = j.i(erVar, 60, 320, 560, false);
        f5014r = j.i(erVar, 90, 380, 560, false);
        f5015s = j.i(erVar, 110, 440, 560, false);
        f5016t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
