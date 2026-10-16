package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import b2.w0;
import b2.x;
import e2.m0;
import t7.u;
public final class h implements r2.k {
    public static h f14177b;
    public final Context f14178a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f14178a = context;
                return;
            default:
                this.f14178a = context.getApplicationContext();
                return;
        }
    }

    public static h a(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (f14177b == null) {
                    o.a(context);
                    f14177b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14177b;
    }

    public static final l b(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean c(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.c(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public r2.l h(com.google.firebase.messaging.m mVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.f14178a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = w0.h(((x) mVar.f6196c).f2523s);
            e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.I(h));
            r2.b bVar = new r2.b(h, 0);
            r2.b bVar2 = new r2.b(h, 1);
            ?? obj = new Object();
            obj.f1053b = bVar;
            obj.f1054c = bVar2;
            obj.f1052a = true;
            obj.f1052a = true;
            return obj.h(mVar);
        }
        return new u(20).h(mVar);
    }
}
