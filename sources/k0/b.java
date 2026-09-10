package k0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import hd.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import v0.j;
import v0.l;
import v0.n;
import v0.p;
import xa.c;
public final class b {
    public final Context f11992a;

    public b(Context context, boolean z10) {
        this.f11992a = context;
    }

    public static j b(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.d();
        }
        if (obj instanceof n) {
            for (p pVar : ((n) obj).f42837a) {
            }
        }
        Context ctx = bVar.f11992a;
        i.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i10 = Build.VERSION.SDK_INT;
            l lVar = null;
            if (i10 >= 34) {
                l lVar2 = new l(ctx);
                if (lVar2.isAvailableOnDevice()) {
                    lVar = lVar2;
                }
                if (lVar == null) {
                    return bVar.d();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return bVar.d();
            }
        }
        return bVar.d();
    }

    public void a(aa.a aVar, b2.p pVar, c cVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager g10;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.f1870c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        pVar.f1870c = cancellationSignal2;
                        if (pVar.f1869b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) pVar.f1870c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (g10 = e0.b.g(this.f11992a)) != null) {
            e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new a(cVar));
        }
    }

    public PackageInfo c(int i10, String str) {
        return this.f11992a.getPackageManager().getPackageInfo(str, i10);
    }

    public j d() {
        String string;
        Context context = this.f11992a;
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
        List<String> m10 = g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        j jVar = null;
        for (String str : m10) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                j jVar2 = (j) newInstance;
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

    public b(Context context) {
        i.e(context, "context");
        this.f11992a = context;
    }
}
