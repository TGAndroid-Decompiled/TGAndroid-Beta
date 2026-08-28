package ch;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.gr;
public abstract class h {
    public static final DecelerateInterpolator f2455a = new DecelerateInterpolator();
    public static final LinearInterpolator f2456b;
    public static final e f2457c;
    public static final e d;
    public static final e f2458e;
    public static final e f2459f;
    public static final e f2460g;
    public static final e h;
    public static final e f2461i;
    public static final e f2462j;
    public static final e f2463k;
    public static final e f2464l;
    public static final e f2465m;
    public static final e f2466n;
    public static final e f2467o;
    public static final e f2468p;
    public static final e f2469q;
    public static final e f2470r;
    public static final e f2471s;
    public static final e f2472t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f2456b = linearInterpolator;
        f2457c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        f2458e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f2459f = j.i(new gr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f2460g = j.i(new gr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f2461i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        gr grVar = gr.h;
        f2462j = j.i(grVar, 0, 320, 560, false);
        f2463k = j.i(grVar, 40, 320, 560, false);
        f2464l = j.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f2465m = j.i(grVar, 0, 460, 560, false);
        f2466n = j.i(grVar, 0, 325, 560, false);
        f2467o = j.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f2468p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f2469q = j.i(grVar, 60, 320, 560, false);
        f2470r = j.i(grVar, 90, 380, 560, false);
        f2471s = j.i(grVar, 110, 440, 560, false);
        f2472t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
