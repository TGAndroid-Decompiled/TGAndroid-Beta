package k6;

import a3.l0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v0.p;
import v7.t;
public final class h implements androidx.emoji2.text.k {
    public static h f14972b;
    public final Context f14973a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f14973a = context.getApplicationContext();
                return;
            case 2:
                this.f14973a = context.getApplicationContext();
                return;
            case 3:
                kotlin.jvm.internal.i.e(context, "context");
                this.f14973a = context;
                return;
            default:
                this.f14973a = context.getApplicationContext();
                return;
        }
    }

    public static v0.j b(h hVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return hVar.d();
        }
        if (obj instanceof v0.n) {
            for (p pVar : ((v0.n) obj).f47879a) {
            }
        }
        Context ctx = hVar.f14973a;
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
                    return hVar.d();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return hVar.d();
            }
        }
        return hVar.d();
    }

    public static h c(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (f14972b == null) {
                    o.a(context);
                    f14972b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14972b;
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
        threadPoolExecutor.execute(new l0(this, tVar, threadPoolExecutor, 18));
    }

    public v0.j d() {
        String string;
        Context context = this.f14973a;
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
        List<String> m10 = jd.g.m(arrayList);
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
}
