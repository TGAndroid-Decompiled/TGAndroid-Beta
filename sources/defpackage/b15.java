package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
public final class b15 {
    public static b15 b;
    public final Context a;

    public b15(Context context) {
        this.a = context.getApplicationContext();
    }

    public static b15 a(Context context) {
        b15 b15Var;
        ite.h(context);
        synchronized (b15.class) {
            b15Var = b;
            if (b15Var == null) {
                i7f.a(context);
                b15Var = new b15(context);
                b = b15Var;
            }
        }
        return b15Var;
    }

    public static final boolean b(android.content.pm.PackageInfo r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b15.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static zoe c(PackageInfo packageInfo, zoe... zoeVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            gue gueVar = new gue(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zoeVarArr.length; i++) {
                if (zoeVarArr[i].equals(gueVar)) {
                    return zoeVarArr[i];
                }
            }
        }
        return null;
    }
}
