package k6;

import a3.k0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k2.g0;
import v7.t;
public final class h implements androidx.emoji2.text.k, v0.h {
    public static h f14712b;
    public final Context f14713a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f14713a = context.getApplicationContext();
                return;
            case 2:
                this.f14713a = context.getApplicationContext();
                return;
            case 3:
                kotlin.jvm.internal.i.e(context, "context");
                this.f14713a = context;
                return;
            case 4:
                this.f14713a = context;
                return;
            default:
                this.f14713a = context.getApplicationContext();
                return;
        }
    }

    public static h c(Context context) {
        n6.m.h(context);
        synchronized (h.class) {
            try {
                if (f14712b == null) {
                    o.a(context);
                    f14712b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14712b;
    }

    public static final l e(PackageInfo packageInfo, l... lVarArr) {
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

    public static final boolean f(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.f(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public void a(t tVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k0(this, tVar, threadPoolExecutor, 11));
    }

    public Object b(Context context, v0.e eVar, jd.c cVar) {
        ae.m mVar = new ae.m(1, w7.h.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        g0 g0Var = new g0(mVar, 27);
        a3.b bVar = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j a2 = r2.h.a(new r2.h(this.f14713a, 1), eVar);
        if (a2 == null) {
            g0Var.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            g0Var.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, g0Var);
        }
        Object r10 = mVar.r();
        kd.a aVar = kd.a.f14783a;
        return r10;
    }

    public PackageInfo d(int i10, String str) {
        return this.f14713a.getPackageManager().getPackageInfo(str, i10);
    }
}
