package l5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b2.r0;
import ci.u5;
import e2.d0;
import java.util.ArrayList;
import java.util.List;
import m.f3;
import m.y0;
import n4.y;
import n7.z0;
public final class j implements r2.k {
    public Context f15163a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.f15163a = context;
                return;
            default:
                this.f15163a = context;
                return;
        }
    }

    public static v0.j b(j jVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return jVar.c();
        }
        if (obj instanceof v0.n) {
            for (v0.p pVar : ((v0.n) obj).f49259a) {
            }
        }
        Context ctx = jVar.f15163a;
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
                    return jVar.c();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return jVar.c();
            }
        }
        return jVar.c();
    }

    public k a() {
        Context context = this.f15163a;
        if (context != null) {
            ?? obj = new Object();
            obj.f15164a = n5.a.a(n.f15171a);
            l2.g gVar = new l2.g(context, 5);
            obj.f15165b = gVar;
            obj.f15166c = n5.a.a(new y(27, gVar, new y0(gVar, 1)));
            l2.g gVar2 = obj.f15165b;
            obj.d = new y0(gVar2, 19);
            gd.a a2 = n5.a.a(new z0(16, obj.d, n5.a.a(new n4.l(gVar2))));
            obj.f15167e = a2;
            rb.a aVar = new rb.a(19, false);
            l2.g gVar3 = obj.f15165b;
            f3 f3Var = new f3(gVar3, a2, aVar, 22);
            gd.a aVar2 = obj.f15164a;
            gd.a aVar3 = obj.f15166c;
            u5 u5Var = new u5(aVar2, aVar3, f3Var, a2, a2);
            ?? obj2 = new Object();
            obj2.f15555a = gVar3;
            obj2.f15556b = aVar3;
            obj2.f15557c = a2;
            obj2.d = f3Var;
            obj2.f15558e = aVar2;
            obj2.f15559f = a2;
            obj2.h = a2;
            ?? obj3 = new Object();
            obj3.f16927a = aVar2;
            obj3.f16928b = a2;
            obj3.f16929c = f3Var;
            obj3.d = a2;
            obj.f15168f = n5.a.a(new aa.a(u5Var, obj2, obj3, false, 28));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public v0.j c() {
        String string;
        Context context = this.f15163a;
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
        List<String> m10 = id.g.m(arrayList);
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

    @Override
    public r2.l m(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.f15163a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = r0.h(((b2.s) nVar.f7952c).f3641r);
            e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.F(h));
            return new n6.k(15, new r2.b(h, 0), new r2.b(h, 1)).m(nVar);
        }
        return new Object().m(nVar);
    }
}
