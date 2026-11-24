package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;
public abstract class wee {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ns3.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ns3.c(edgeEffect, f, f2);
        }
        ms3.a(edgeEffect, f, f2);
        return f;
    }
}
