package i0;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import c8.he;
import c8.k0;
import java.lang.reflect.Method;
public abstract class f {
    public static final k0 f15580a;
    public static final a0.j f15581b;

    static {
        he.a("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f15580a = new k0();
        } else if (i7 >= 28) {
            f15580a = new i();
        } else if (i7 >= 26) {
            f15580a = new i();
        } else {
            if (i7 >= 24) {
                Method method = h.f15588c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f15580a = new k0();
                }
            }
            f15580a = new k0();
        }
        f15581b = new a0.j(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r12, h0.d r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, h2.j0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a(android.content.Context, h0.d, android.content.res.Resources, int, java.lang.String, int, int, h2.j0):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i7, String str, int i10, int i11) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i10 + '-' + i7 + '-' + i11;
    }
}
