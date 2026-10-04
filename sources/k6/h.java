package k6;

import a3.k0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v7.x;
public final class h implements androidx.emoji2.text.k {
    public static h f14681b;
    public final Context f14682a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f14682a = context.getApplicationContext();
                return;
            case 2:
                this.f14682a = context.getApplicationContext();
                return;
            default:
                this.f14682a = context.getApplicationContext();
                return;
        }
    }

    public static h b(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (f14681b == null) {
                    o.a(context);
                    f14681b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14681b;
    }

    public static final l c(PackageInfo packageInfo, l... lVarArr) {
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

    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public void a(x xVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k0(this, xVar, threadPoolExecutor, 11));
    }
}
