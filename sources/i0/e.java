package i0;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import h7.f8;
import h7.m8;
import java.lang.reflect.Method;
public abstract class e {
    public static final f8 f8192a;
    public static final a0.j f8193b;

    static {
        m8.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f8192a = new f8();
        } else if (i10 >= 28) {
            f8192a = new h();
        } else if (i10 >= 26) {
            f8192a = new h();
        } else {
            if (i10 >= 24) {
                Method method = g.f8200c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f8192a = new f8();
                }
            }
            f8192a = new f8();
        }
        f8193b = new a0.j(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r12, h0.d r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, f5.b0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i0.e.a(android.content.Context, h0.d, android.content.res.Resources, int, java.lang.String, int, int, f5.b0):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
