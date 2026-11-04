package i0;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import b8.sc;
import java.lang.reflect.Method;
import x7.e6;
public abstract class e {
    public static final sc f14501a;
    public static final a0.j f14502b;

    static {
        e6.a("TypefaceCompat static init");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f14501a = new sc();
        } else if (i3 >= 28) {
            f14501a = new h();
        } else if (i3 >= 26) {
            f14501a = new h();
        } else {
            if (i3 >= 24) {
                Method method = g.f14509c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f14501a = new sc();
                }
            }
            f14501a = new sc();
        }
        f14502b = new a0.j(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r12, h0.d r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, g2.k0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i0.e.a(android.content.Context, h0.d, android.content.res.Resources, int, java.lang.String, int, int, g2.k0):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i3, String str, int i10, int i11) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i10 + '-' + i3 + '-' + i11;
    }
}
