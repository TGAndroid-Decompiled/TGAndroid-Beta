package k6;

import a3.k0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v0.p;
import v7.y;
public final class h implements androidx.emoji2.text.k {
    public static h f13502b;
    public final Context f13503a;

    public h(Context context, short s10) {
        this.f13503a = context;
    }

    public static v0.j c(h hVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return hVar.f();
        }
        if (obj instanceof v0.n) {
            for (p pVar : ((v0.n) obj).f44100a) {
            }
        }
        Context ctx = hVar.f13503a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i10 = Build.VERSION.SDK_INT;
            v0.l lVar = null;
            if (i10 >= 34) {
                v0.l lVar2 = new v0.l(ctx);
                if (lVar2.isAvailableOnDevice()) {
                    lVar = lVar2;
                }
                if (lVar == null) {
                    return hVar.f();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return hVar.f();
            }
        }
        return hVar.f();
    }

    public static h d(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (f13502b == null) {
                    o.a(context);
                    f13502b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13502b;
    }

    public static final l g(PackageInfo packageInfo, l... lVarArr) {
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

    public static final boolean h(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.h(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public void a(y yVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k0(this, yVar, threadPoolExecutor, 11));
    }

    public void b(aa.a aVar, b2.p pVar, a6.m mVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager g10;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.f3169c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        pVar.f3169c = cancellationSignal2;
                        if (pVar.f3168b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) pVar.f3169c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (g10 = e0.b.g(this.f13503a)) != null) {
            e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new k0.a(mVar));
        }
    }

    public PackageInfo e(int i10, String str) {
        return this.f13503a.getPackageManager().getPackageInfo(str, i10);
    }

    public v0.j f() {
        String string;
        Context context = this.f13503a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List<String> m10 = hd.g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        v0.j jVar = null;
        for (String str : m10) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.j jVar2 = (v0.j) newInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else if (jVar != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f13503a = context.getApplicationContext();
                return;
            case 2:
                this.f13503a = context.getApplicationContext();
                return;
            case 3:
            default:
                this.f13503a = context.getApplicationContext();
                return;
            case 4:
                kotlin.jvm.internal.i.e(context, "context");
                this.f13503a = context;
                return;
        }
    }
}
