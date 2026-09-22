package l5;

import android.content.Context;
import android.os.CancellationSignal;
import ki.e0;
public final class j implements v0.h {
    public Context f14110a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.f14110a = context;
                return;
            default:
                this.f14110a = context;
                return;
        }
    }

    public static int c(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: l5.j.c(b2.s):int");
    }

    public k a() {
        Context context = this.f14110a;
        if (context != null) {
            ?? obj = new Object();
            obj.f14111a = n5.a.a(n.f14117a);
            a9.r rVar = new a9.r(context);
            obj.f14112b = rVar;
            obj.f14113c = n5.a.a(new m5.e(0, rVar, new android.support.v4.media.c(rVar, 28)));
            a9.r rVar2 = obj.f14112b;
            obj.d = new e0(rVar2, 21);
            fd.a a2 = n5.a.a(new m5.e(20, obj.d, n5.a.a(new k2.e(rVar2, 24))));
            obj.e = a2;
            qb.b bVar = new qb.b(19);
            a9.r rVar3 = obj.f14112b;
            lf.h hVar = new lf.h(rVar3, a2, bVar, 21);
            fd.a aVar = obj.f14111a;
            fd.a aVar2 = obj.f14113c;
            cf.c cVar = new cf.c(aVar, aVar2, hVar, a2, a2);
            ?? obj2 = new Object();
            obj2.f14518a = rVar3;
            obj2.f14519b = aVar2;
            obj2.f14520c = a2;
            obj2.d = hVar;
            obj2.e = aVar;
            obj2.f14521f = a2;
            obj2.h = a2;
            ?? obj3 = new Object();
            obj3.f15763a = aVar;
            obj3.f15764b = a2;
            obj3.f15765c = hVar;
            obj3.d = a2;
            obj.f14114f = n5.a.a(new aa.a(cVar, obj2, obj3, false, 28));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public Object b(Context context, v0.e eVar, id.c cVar) {
        zd.m mVar = new zd.m(1, w7.g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        k2.e eVar2 = new k2.e(mVar, 26);
        a3.b bVar = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j a2 = v0.k.a(new v0.k(this.f14110a, 0), eVar);
        if (a2 == null) {
            eVar2.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            eVar2.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, eVar2);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f12971a;
        return r10;
    }
}
