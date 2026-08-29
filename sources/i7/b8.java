package i7;

import android.os.Build;
import android.widget.EdgeEffect;
public abstract class b8 {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f9, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.c.c(edgeEffect, f9, f10);
        }
        u0.b.a(edgeEffect, f9, f10);
        return f9;
    }
}
