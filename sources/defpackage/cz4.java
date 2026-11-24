package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
public final class cz4 {
    public static cz4 b;
    public final Context a;

    public cz4(Context context) {
        this.a = context.getApplicationContext();
    }

    public static cz4 a(Context context) {
        cz4 cz4Var;
        fre.h(context);
        synchronized (cz4.class) {
            cz4Var = b;
            if (cz4Var == null) {
                g5f.a(context);
                cz4Var = new cz4(context);
                b = cz4Var;
            }
        }
        return cz4Var;
    }

    public static final boolean b(android.content.pm.PackageInfo r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz4.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static wme c(PackageInfo packageInfo, wme... wmeVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            dse dseVar = new dse(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < wmeVarArr.length; i++) {
                if (wmeVarArr[i].equals(dseVar)) {
                    return wmeVarArr[i];
                }
            }
        }
        return null;
    }
}
