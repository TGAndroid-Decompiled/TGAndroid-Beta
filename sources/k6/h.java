package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import ji.u4;
import k2.g0;
import m2.t;
import n4.y;
import v0.p;
public final class h {
    public static h f14848b;
    public Context f14849a;

    public h(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.f14849a = context;
                return;
            case 3:
                this.f14849a = context;
                return;
            default:
                this.f14849a = context.getApplicationContext();
                return;
        }
    }

    public static v0.j b(h hVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return hVar.e();
        }
        if (obj instanceof v0.n) {
            for (p pVar : ((v0.n) obj).f47299a) {
            }
        }
        Context ctx = hVar.f14849a;
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
                    return hVar.e();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return hVar.e();
            }
        }
        return hVar.e();
    }

    public static h c(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (f14848b == null) {
                    o.a(context);
                    f14848b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14848b;
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
        throw new UnsupportedOperationException("Method not decompiled: k6.h.g(android.content.pm.PackageInfo, boolean):boolean");
    }

    public l5.j a() {
        Context context = this.f14849a;
        if (context != null) {
            ?? obj = new Object();
            obj.f15313a = n5.a.a(l5.m.f15320a);
            l.d dVar = new l.d(context, 6);
            obj.f15314b = dVar;
            obj.f15315c = n5.a.a(new y(25, dVar, new u4(dVar, 5)));
            l.d dVar2 = obj.f15314b;
            obj.d = new g0(dVar2, 22);
            fd.a a2 = n5.a.a(new o0.a(16, obj.d, n5.a.a(new mg.n(dVar2, 16))));
            obj.f15316e = a2;
            rb.a aVar = new rb.a(19);
            l.d dVar3 = obj.f15314b;
            t tVar = new t(dVar3, a2, aVar, 19);
            fd.a aVar2 = obj.f15313a;
            fd.a aVar3 = obj.f15315c;
            ?? obj2 = new Object();
            obj2.f4823a = aVar2;
            obj2.f4824b = aVar3;
            obj2.f4825c = tVar;
            obj2.d = a2;
            obj2.f4826e = a2;
            ?? obj3 = new Object();
            obj3.f15661a = dVar3;
            obj3.f15662b = aVar3;
            obj3.f15663c = a2;
            obj3.d = tVar;
            obj3.f15664e = aVar2;
            obj3.f15665f = a2;
            obj3.h = a2;
            ?? obj4 = new Object();
            obj4.f9520a = aVar2;
            obj4.f9521b = a2;
            obj4.f9522c = tVar;
            obj4.d = a2;
            obj.f15317f = n5.a.a(new aa.a(obj2, obj3, obj4, false, 27));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public PackageInfo d(int i10, String str) {
        return this.f14849a.getPackageManager().getPackageInfo(str, i10);
    }

    public v0.j e() {
        String string;
        Context context = this.f14849a;
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
}
