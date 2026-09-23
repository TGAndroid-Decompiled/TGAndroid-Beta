package l5;

import android.content.Context;
import android.os.CancellationSignal;
import k2.b0;
import n4.y;
import org.telegram.ui.Cells.ja;
public final class j implements v0.h {
    public Context f13886a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.f13886a = context;
                return;
            default:
                this.f13886a = context;
                return;
        }
    }

    public static int c(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: l5.j.c(b2.s):int");
    }

    public k a() {
        Context context = this.f13886a;
        if (context != null) {
            ?? obj = new Object();
            obj.f13887a = n5.a.a(n.f13893a);
            a9.r rVar = new a9.r(context);
            obj.f13888b = rVar;
            obj.f13889c = n5.a.a(new y(26, rVar, new b0(rVar, 5)));
            a9.r rVar2 = obj.f13888b;
            obj.d = new ka.c(rVar2, 18);
            fd.a a2 = n5.a.a(new o0.a(16, obj.d, n5.a.a(new ja(rVar2, 14))));
            obj.e = a2;
            qb.b bVar = new qb.b(19);
            a9.r rVar3 = obj.f13888b;
            lf.i iVar = new lf.i(rVar3, a2, bVar, 21);
            fd.a aVar = obj.f13887a;
            fd.a aVar2 = obj.f13889c;
            ?? obj2 = new Object();
            obj2.f4252a = aVar;
            obj2.f4253b = aVar2;
            obj2.f4254c = iVar;
            obj2.d = a2;
            obj2.e = a2;
            ?? obj3 = new Object();
            obj3.f14270a = rVar3;
            obj3.f14271b = aVar2;
            obj3.f14272c = a2;
            obj3.d = iVar;
            obj3.e = aVar;
            obj3.f14273f = a2;
            obj3.h = a2;
            ?? obj4 = new Object();
            obj4.f15232a = aVar;
            obj4.f15233b = a2;
            obj4.f15234c = iVar;
            obj4.d = a2;
            obj.f13890f = n5.a.a(new aa.a(obj2, obj3, obj4, false, 28));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public Object b(Context context, v0.e eVar, id.c cVar) {
        zd.m mVar = new zd.m(1, w7.g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        ja jaVar = new ja(mVar, 16);
        a3.b bVar = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j a2 = v0.k.a(new v0.k(this.f13886a, 0), eVar);
        if (a2 == null) {
            jaVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            jaVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, jaVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f12959a;
        return r10;
    }
}
