package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;
public abstract class xge {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return xt3.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return xt3.c(edgeEffect, f, f2);
        }
        wt3.a(edgeEffect, f, f2);
        return f;
    }
}
