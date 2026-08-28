package i0;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import f7.j8;
import f7.r8;
import java.lang.reflect.Method;
public abstract class e {
    public static final j8 f10854a;
    public static final a0.j f10855b;

    static {
        r8.a("TypefaceCompat static init");
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            f10854a = new j8();
        } else if (i9 >= 28) {
            f10854a = new h();
        } else if (i9 >= 26) {
            f10854a = new h();
        } else {
            if (i9 >= 24) {
                Method method = g.f10862c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f10854a = new j8();
                }
            }
            f10854a = new j8();
        }
        f10855b = new a0.j(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r14, h0.d r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, d5.d0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: i0.e.a(android.content.Context, h0.d, android.content.res.Resources, int, java.lang.String, int, int, d5.d0):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i9, String str, int i10, int i11) {
        return resources.getResourcePackageName(i9) + '-' + str + '-' + i10 + '-' + i9 + '-' + i11;
    }
}
