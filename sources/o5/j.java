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
import m.o3;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.i61;
public final class j {
    public Context f21807a;

    public j(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f21807a = context;
    }

    public static v0.i b(j jVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return jVar.c();
        }
        if (obj instanceof v0.m) {
            for (v0.h hVar : ((v0.m) obj).f59148a) {
                if (hVar instanceof v0.o) {
                    return jVar.c();
                }
            }
        }
        Context ctx = jVar.f21807a;
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
        Context context = this.f21807a;
        if (context != null) {
            ?? obj = new Object();
            obj.f21808a = q5.a.a(n.f21815a);
            i5 i5Var = new i5(context);
            obj.f21809b = i5Var;
            obj.f21810c = q5.a.a(new j6.k(i5Var, new aa(i5Var, 11), false, 22));
            i5 i5Var2 = obj.f21809b;
            obj.d = new v4.b(i5Var2, 3);
            fd.a a10 = q5.a.a(new s2.e(7, obj.d, q5.a.a(new aa(i5Var2, 27))));
            obj.f21811e = a10;
            pb.b bVar = new pb.b(25);
            i5 i5Var3 = obj.f21809b;
            i61 i61Var = new i61(i5Var3, a10, bVar, 19);
            fd.a aVar = obj.f21808a;
            fd.a aVar2 = obj.f21810c;
            obj.f21812f = q5.a.a(new h6.m(new r7(aVar, aVar2, i61Var, a10, a10, 21), new o3(i5Var3, aVar2, a10, i61Var, aVar, a10, a10), new xi.e(aVar, a10, i61Var, a10), false, 18));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public v0.i c() {
        String string;
        Context context = this.f21807a;
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
