package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
public abstract class s3c {
    public static final vwe a;
    public static final fg6 b;

    static {
        wve.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new vwe();
        } else if (i >= 28) {
            a = new v3c();
        } else if (i >= 26) {
            a = new v3c();
        } else {
            if (i >= 24) {
                if (u3c.c == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                } else {
                    a = new vwe();
                }
            }
            a = new vwe();
        }
        b = new fg6(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r12, defpackage.wl4 r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, defpackage.iq r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3c.a(android.content.Context, wl4, android.content.res.Resources, int, java.lang.String, int, int, iq):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
