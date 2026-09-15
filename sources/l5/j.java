package l5;

import android.content.Context;
import android.os.CancellationSignal;
import k2.c0;
import m.e3;
import n4.y;
import org.telegram.ui.Cells.ia;
public final class j implements v0.h {
    public Context f13900a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.f13900a = context;
                return;
            default:
                this.f13900a = context;
                return;
        }
    }

    public static int c(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: l5.j.c(b2.s):int");
    }

    public k a() {
        Context context = this.f13900a;
        if (context != null) {
            ?? obj = new Object();
            obj.f13901a = n5.a.a(n.f13907a);
            a9.r rVar = new a9.r(context);
            obj.f13902b = rVar;
            obj.f13903c = n5.a.a(new y(26, rVar, new c0(rVar, 5)));
            a9.r rVar2 = obj.f13902b;
            obj.d = new ka.c(rVar2, 18);
            fd.a a2 = n5.a.a(new o0.a(16, obj.d, n5.a.a(new ia(rVar2, 14))));
            obj.e = a2;
            qb.b bVar = new qb.b(19);
            a9.r rVar3 = obj.f13902b;
            e3 e3Var = new e3(rVar3, a2, bVar, 20);
            fd.a aVar = obj.f13901a;
            fd.a aVar2 = obj.f13903c;
            ?? obj2 = new Object();
            obj2.f4255a = aVar;
            obj2.f4256b = aVar2;
            obj2.f4257c = e3Var;
            obj2.d = a2;
            obj2.e = a2;
            ?? obj3 = new Object();
            obj3.f14288a = rVar3;
            obj3.f14289b = aVar2;
            obj3.f14290c = a2;
            obj3.d = e3Var;
            obj3.e = aVar;
            obj3.f14291f = a2;
            obj3.h = a2;
            ?? obj4 = new Object();
            obj4.f15257a = aVar;
            obj4.f15258b = a2;
            obj4.f15259c = e3Var;
            obj4.d = a2;
            obj.f13904f = n5.a.a(new aa.a(obj2, obj3, obj4, false, 27));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public Object b(Context context, v0.e eVar, id.c cVar) {
        zd.m mVar = new zd.m(1, w7.g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        ia iaVar = new ia(mVar, 16);
        a3.b bVar = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j a2 = v0.k.a(new v0.k(this.f13900a, 0), eVar);
        if (a2 == null) {
            iaVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            iaVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, iaVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f12967a;
        return r10;
    }
}
