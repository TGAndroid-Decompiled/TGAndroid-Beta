package l6;

import a3.l0;
import a8.h0;
import a8.i1;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import b2.u;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class h implements androidx.emoji2.text.k {
    public static h f16936b;
    public final Context f16937a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f16937a = context.getApplicationContext();
                return;
            case 2:
                this.f16937a = context.getApplicationContext();
                return;
            case 3:
                this.f16937a = context;
                return;
            case 4:
                context.getClass();
                this.f16937a = context;
                return;
            default:
                this.f16937a = context.getApplicationContext();
                return;
        }
    }

    public static FingerprintManager c(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static h d(Context context) {
        o6.l.h(context);
        synchronized (h.class) {
            try {
                if (f16936b == null) {
                    o.a(context);
                    f16936b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16936b;
    }

    public static int e(b2.x r5) {
        throw new UnsupportedOperationException("Method not decompiled: l6.h.e(b2.x):int");
    }

    public static final l f(PackageInfo packageInfo, l... lVarArr) {
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

    public static final boolean g(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: l6.h.g(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public void a(i1 i1Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new l0(this, i1Var, threadPoolExecutor, 5));
    }

    public void b(h0 h0Var, u uVar, rb.c cVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.f3464c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        uVar.f3464c = cancellationSignal3;
                        if (uVar.f3463b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) uVar.f3464c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager c10 = c(this.f16937a);
        if (c10 != null) {
            if (h0Var != null) {
                Mac mac = (Mac) h0Var.d;
                java.security.Signature signature = (java.security.Signature) h0Var.f511b;
                Cipher cipher = (Cipher) h0Var.f512c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            c10.authenticate(cryptoObject, cancellationSignal, 0, new k0.a(cVar), null);
        }
    }
}
