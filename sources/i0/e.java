package i0;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import c8.he;
import c8.j0;
import java.lang.reflect.Method;
public abstract class e {
    public static final j0 f15128a;
    public static final a0.j f15129b;

    static {
        he.a("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f15128a = new j0();
        } else if (i7 >= 28) {
            f15128a = new h();
        } else if (i7 >= 26) {
            f15128a = new h();
        } else {
            if (i7 >= 24) {
                Method method = g.f15136c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f15128a = new j0();
                }
            }
            f15128a = new j0();
        }
        f15129b = new a0.j(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r14, h0.d r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, h2.j0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: i0.e.a(android.content.Context, h0.d, android.content.res.Resources, int, java.lang.String, int, int, h2.j0):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i7, String str, int i10, int i11) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i10 + '-' + i7 + '-' + i11;
    }
}
