package o5;

import a8.r7;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ff;
import org.telegram.ui.ld0;
import sg.h0;
public final class j {
    public Context f21350a;

    public j(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f21350a = context;
    }

    public static v0.i b(j jVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return jVar.c();
        }
        if (obj instanceof v0.m) {
            for (v0.h hVar : ((v0.m) obj).f58456a) {
                if (hVar instanceof v0.o) {
                    return jVar.c();
                }
            }
        }
        Context ctx = jVar.f21350a;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i7 = Build.VERSION.SDK_INT;
            v0.k kVar = null;
            if (i7 >= 34) {
                v0.k kVar2 = new v0.k(ctx);
                if (kVar2.isAvailableOnDevice()) {
                    kVar = kVar2;
                }
                if (kVar == null) {
                    return jVar.c();
                }
                return kVar;
            } else if (i7 > 33) {
                return null;
            } else {
                return jVar.c();
            }
        }
        return jVar.c();
    }

    public k a() {
        Context context = this.f21350a;
        if (context != null) {
            ?? obj = new Object();
            obj.f21351a = q5.a.a(n.f21358a);
            d9.o oVar = new d9.o(context, 3);
            obj.f21352b = oVar;
            obj.f21353c = q5.a.a(new ji.j(21, oVar, new ff(oVar, 9)));
            d9.o oVar2 = obj.f21352b;
            obj.d = new ff(oVar2, 25);
            fd.a a10 = q5.a.a(new h0(6, obj.d, q5.a.a(new u7.i(oVar2))));
            obj.f21354e = a10;
            pb.b bVar = new pb.b(25);
            d9.o oVar3 = obj.f21352b;
            ld0 ld0Var = new ld0(oVar3, a10, bVar, 17);
            fd.a aVar = obj.f21351a;
            fd.a aVar2 = obj.f21353c;
            obj.f21355f = q5.a.a(new h6.m(new r7(aVar, aVar2, ld0Var, a10, a10, 21), new ga.d(oVar3, aVar2, a10, ld0Var, aVar, a10, a10, 5), new xi.e(aVar, a10, ld0Var, a10), false, 17));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public v0.i c() {
        String string;
        Context context = this.f21350a;
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
        List<String> l10 = hd.f.l(arrayList);
        if (l10.isEmpty()) {
            return null;
        }
        v0.i iVar = null;
        for (String str : l10) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.i iVar2 = (v0.i) newInstance;
                if (!iVar2.isAvailableOnDevice()) {
                    continue;
                } else if (iVar != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    iVar = iVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }
}
