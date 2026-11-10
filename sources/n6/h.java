package n6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
public final class h {
    public static h f20512b;
    public final Context f20513a;

    public h(Context context) {
        this.f20513a = context.getApplicationContext();
    }

    public static h a(Context context) {
        q6.m.g(context);
        synchronized (h.class) {
            try {
                if (f20512b == null) {
                    o.a(context);
                    f20512b = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f20512b;
    }

    public static final boolean b(android.content.pm.PackageInfo r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: n6.h.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static l c(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < lVarArr.length; i7++) {
                if (lVarArr[i7].equals(mVar)) {
                    return lVarArr[i7];
                }
            }
        }
        return null;
    }
}
