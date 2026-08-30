package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import tc.g;
import v0.l;
import v0.n;
import v0.p;
public final class b {
    public final Context f9754a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                j.e(context, "context");
                this.f9754a = context;
                return;
            default:
                this.f9754a = context;
                return;
        }
    }

    public static v0.j a(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.c();
        }
        if (obj instanceof n) {
            for (p pVar : ((n) obj).f45547a) {
            }
        }
        Context ctx = bVar.f9754a;
        j.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i10 = Build.VERSION.SDK_INT;
            l lVar = null;
            if (i10 >= 34) {
                l lVar2 = new l(ctx);
                if (lVar2.isAvailableOnDevice()) {
                    lVar = lVar2;
                }
                if (lVar == null) {
                    return bVar.c();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return bVar.c();
            }
        }
        return bVar.c();
    }

    public PackageInfo b(int i10, String str) {
        return this.f9754a.getPackageManager().getPackageInfo(str, i10);
    }

    public v0.j c() {
        String string;
        Context context = this.f9754a;
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
        List<String> m9 = g.m(arrayList);
        if (m9.isEmpty()) {
            return null;
        }
        v0.j jVar = null;
        for (String str : m9) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
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
