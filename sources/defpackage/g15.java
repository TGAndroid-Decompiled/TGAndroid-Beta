package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
public final class g15 {
    public static g15 b;
    public final Context a;

    public g15(Context context) {
        this.a = context.getApplicationContext();
    }

    public static g15 a(Context context) {
        g15 g15Var;
        xve.h(context);
        synchronized (g15.class) {
            g15Var = b;
            if (g15Var == null) {
                x9f.a(context);
                g15Var = new g15(context);
                b = g15Var;
            }
        }
        return g15Var;
    }

    public static final boolean b(android.content.pm.PackageInfo r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g15.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static nre c(PackageInfo packageInfo, nre... nreVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            uwe uweVar = new uwe(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < nreVarArr.length; i++) {
                if (nreVarArr[i].equals(uweVar)) {
                    return nreVarArr[i];
                }
            }
        }
        return null;
    }
}
