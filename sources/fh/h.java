package fh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.jr;
public abstract class h {
    public static final DecelerateInterpolator f6794a = new DecelerateInterpolator();
    public static final LinearInterpolator f6795b;
    public static final e f6796c;
    public static final e d;
    public static final e f6797e;
    public static final e f6798f;
    public static final e f6799g;
    public static final e h;
    public static final e f6800i;
    public static final e f6801j;
    public static final e f6802k;
    public static final e f6803l;
    public static final e f6804m;
    public static final e f6805n;
    public static final e f6806o;
    public static final e f6807p;
    public static final e f6808q;
    public static final e f6809r;
    public static final e f6810s;
    public static final e f6811t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f6795b = linearInterpolator;
        f6796c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        f6797e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f6798f = j.i(new jr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f6799g = j.i(new jr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f6800i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        jr jrVar = jr.h;
        f6801j = j.i(jrVar, 0, 320, 560, false);
        f6802k = j.i(jrVar, 40, 320, 560, false);
        f6803l = j.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f6804m = j.i(jrVar, 0, 460, 560, false);
        f6805n = j.i(jrVar, 0, 325, 560, false);
        f6806o = j.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f6807p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f6808q = j.i(jrVar, 60, 320, 560, false);
        f6809r = j.i(jrVar, 90, 380, 560, false);
        f6810s = j.i(jrVar, 110, 440, 560, false);
        f6811t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
