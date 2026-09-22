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
import b2.r0;
import b2.s;
import e2.d0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Cells.f3;
import v7.w;
public final class h implements androidx.emoji2.text.k, r2.k {
    public static h f13516b;
    public final Context f13517a;

    public h(Context context, char c10) {
        this.f13517a = context;
    }

    public static h d(Context context) {
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
    public r2.l a(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 >= 31 || ((context = this.f13517a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int h = r0.h(((s) nVar.f7330c).f3308r);
            e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.G(h));
            return new f3(new r2.b(h, 0), new r2.b(h, 1), false, 11).a(nVar);
        }
        return new rb.a(20).a(nVar);
    }

    @Override
    public void b(w wVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k0(this, wVar, threadPoolExecutor, 11));
    }

    public void c(aa.a aVar, p pVar, pb.c cVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager g10;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.f3176c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        pVar.f3176c = cancellationSignal2;
                        if (pVar.f3175b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) pVar.f3176c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (g10 = e0.b.g(this.f13517a)) != null) {
            e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new k0.a(cVar));
        }
    }

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f13517a = context.getApplicationContext();
                return;
            case 2:
                this.f13517a = context.getApplicationContext();
                return;
            default:
                this.f13517a = context.getApplicationContext();
                return;
        }
    }
}
