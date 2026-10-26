package m5;

import a8.me;
import aa.m0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b2.w0;
import b2.x;
import e2.n0;
import java.util.ArrayList;
import java.util.List;
import jg.s0;
import li.e3;
import li.h5;
import m4.w1;
public final class j implements r2.k {
    public Context f18336a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.f18336a = context;
                return;
            default:
                this.f18336a = context;
                return;
        }
    }

    public static v0.j b(j jVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return jVar.c();
        }
        if (obj instanceof v0.n) {
            for (v0.p pVar : ((v0.n) obj).f49979a) {
            }
        }
        Context ctx = jVar.f18336a;
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

    @Override
    public r2.l G(m0 m0Var) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.f18336a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = w0.h(((x) m0Var.f1152c).f3586s);
            e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + n0.I(h));
            r2.b bVar = new r2.b(h, 0);
            r2.b bVar2 = new r2.b(h, 1);
            ?? obj = new Object();
            obj.f2121b = bVar;
            obj.f2122c = bVar2;
            obj.f2120a = true;
            obj.f2120a = true;
            return obj.G(m0Var);
        }
        return new u7.s(20).G(m0Var);
    }

    public k a() {
        Context context = this.f18336a;
        if (context != null) {
            ?? obj = new Object();
            obj.f18337a = o5.a.a(n.f18343a);
            b9.p pVar = new b9.p(context);
            obj.f18338b = pVar;
            obj.f18339c = o5.a.a(new w1(3, pVar, new s0(pVar, 11)));
            b9.p pVar2 = obj.f18338b;
            obj.d = new h5(pVar2);
            id.a a2 = o5.a.a(new w1(22, obj.d, o5.a.a(new e3(pVar2, 19))));
            obj.e = a2;
            u7.s sVar = new u7.s(21);
            b9.p pVar3 = obj.f18338b;
            k6.c cVar = new k6.c(pVar3, a2, sVar, 27);
            id.a aVar = obj.f18337a;
            id.a aVar2 = obj.f18339c;
            me meVar = new me(aVar, aVar2, cVar, a2, a2);
            ?? obj2 = new Object();
            obj2.f17844a = pVar3;
            obj2.f17845b = aVar2;
            obj2.f17846c = a2;
            obj2.d = cVar;
            obj2.e = aVar;
            obj2.f17847f = a2;
            obj2.h = a2;
            obj.f18340f = o5.a.a(new k6.c(meVar, (Object) obj2, new ti.e(aVar, a2, cVar, a2), 7));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public v0.j c() {
        String string;
        Context context = this.f18336a;
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
        List<String> m10 = kd.g.m(arrayList);
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
