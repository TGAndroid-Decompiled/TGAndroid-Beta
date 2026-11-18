package i0;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import c8.ke;
import c8.m0;
import java.lang.reflect.Method;
public abstract class e {
    public static final m0 f15898a;
    public static final a0.j f15899b;

    static {
        ke.a("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f15898a = new m0();
        } else if (i7 >= 28) {
            f15898a = new h();
        } else if (i7 >= 26) {
            f15898a = new h();
        } else {
            if (i7 >= 24) {
                Method method = g.f15906c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f15898a = new m0();
                }
            }
            f15898a = new m0();
        }
        f15899b = new a0.j(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r12, h0.d r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, h2.j0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i0.e.a(android.content.Context, h0.d, android.content.res.Resources, int, java.lang.String, int, int, h2.j0):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i7, String str, int i10, int i11) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i10 + '-' + i7 + '-' + i11;
    }
}
