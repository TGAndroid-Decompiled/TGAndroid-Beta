package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
public abstract class r7c {
    public static final p1f a;
    public static final ji6 b;

    static {
        q0f.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new p1f();
        } else if (i >= 28) {
            a = new u7c();
        } else if (i >= 26) {
            a = new u7c();
        } else {
            if (i >= 24) {
                if (t7c.c == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                } else {
                    a = new p1f();
                }
            }
            a = new p1f();
        }
        b = new ji6(16);
        Trace.endSection();
    }

    public static android.graphics.Typeface a(android.content.Context r12, defpackage.bo4 r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, defpackage.jq r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r7c.a(android.content.Context, bo4, android.content.res.Resources, int, java.lang.String, int, int, jq):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
