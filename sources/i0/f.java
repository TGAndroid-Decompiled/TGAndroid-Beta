package i0;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import v7.h8;
import w7.z7;
public abstract class f {
    public static final h8 f11457a;
    public static final a0.k f11458b;

    static {
        z7.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f11457a = new h8();
        } else if (i10 >= 28) {
            f11457a = new i();
        } else if (i10 >= 26) {
            f11457a = new i();
        } else {
            if (i10 >= 24) {
                Method method = h.f11465c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f11457a = new h8();
                }
            }
            f11457a = new h8();
        }
        f11458b = new a0.k(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r12, h0.d r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, e2.a0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a(android.content.Context, h0.d, android.content.res.Resources, int, java.lang.String, int, int, e2.a0):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
