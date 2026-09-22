package k6;

import a3.k0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import b2.p;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v7.w;
public final class h implements androidx.emoji2.text.k {
    public static h f13516b;
    public final Context f13517a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f13517a = context.getApplicationContext();
                return;
            case 2:
                this.f13517a = context.getApplicationContext();
                return;
            case 3:
                this.f13517a = context;
                return;
            default:
                this.f13517a = context.getApplicationContext();
                return;
        }
    }

    public static h c(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (f13516b == null) {
                    o.a(context);
                    f13516b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13516b;
    }

    public static final l d(PackageInfo packageInfo, l... lVarArr) {
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

    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public void a(w wVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k0(this, wVar, threadPoolExecutor, 11));
    }

    public void b(aa.a aVar, p pVar, a6.m mVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager g10;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.f3174c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        pVar.f3174c = cancellationSignal2;
                        if (pVar.f3173b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) pVar.f3174c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (g10 = e0.b.g(this.f13517a)) != null) {
            e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new k0.a(mVar));
        }
    }
}
