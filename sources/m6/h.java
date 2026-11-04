package m6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
public final class h {
    public static h f19195b;
    public final Context f19196a;

    public h(Context context) {
        this.f19196a = context.getApplicationContext();
    }

    public static h a(Context context) {
        p6.m.g(context);
        synchronized (h.class) {
            try {
                if (f19195b == null) {
                    o.a(context);
                    f19195b = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f19195b;
    }

    public static final boolean b(android.content.pm.PackageInfo r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: m6.h.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static l c(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < lVarArr.length; i3++) {
                if (lVarArr[i3].equals(mVar)) {
                    return lVarArr[i3];
                }
            }
        }
        return null;
    }
}
