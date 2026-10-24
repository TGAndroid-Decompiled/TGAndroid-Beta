package l5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.CancellationSignal;
import k2.w0;
import ki.t1;
import m.g3;
import z7.xf;
public final class j implements v0.h {
    public Context f15986a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.f15986a = context;
                return;
            case 3:
                this.f15986a = context;
                return;
            default:
                context.getClass();
                this.f15986a = context;
                return;
        }
    }

    public static int d(b2.w r5) {
        throw new UnsupportedOperationException("Method not decompiled: l5.j.d(b2.w):int");
    }

    public k a() {
        Context context = this.f15986a;
        if (context != null) {
            ?? obj = new Object();
            obj.f15987a = n5.a.a(n.f15993a);
            n5.c cVar = new n5.c(context);
            obj.f15988b = cVar;
            obj.f15989c = n5.a.a(new xf(cVar, new t1(cVar, 6)));
            n5.c cVar2 = obj.f15988b;
            obj.d = new w0(cVar2, 22);
            hd.a a2 = n5.a.a(new mi.q(20, obj.d, n5.a.a(new le.b(cVar2, 21))));
            obj.e = a2;
            oa.d dVar = new oa.d(20);
            n5.c cVar3 = obj.f15988b;
            g3 g3Var = new g3(cVar3, a2, dVar, 21);
            hd.a aVar = obj.f15987a;
            hd.a aVar2 = obj.f15989c;
            ?? obj2 = new Object();
            obj2.f6893b = aVar;
            obj2.f6894c = aVar2;
            obj2.f6892a = g3Var;
            obj2.d = a2;
            obj2.e = a2;
            ?? obj3 = new Object();
            obj3.f16397a = cVar3;
            obj3.f16398b = aVar2;
            obj3.f16399c = a2;
            obj3.d = g3Var;
            obj3.e = aVar;
            obj3.f16400f = a2;
            obj3.h = a2;
            ?? obj4 = new Object();
            obj4.f45175a = aVar;
            obj4.f45176b = a2;
            obj4.f45177c = g3Var;
            obj4.d = a2;
            obj.f15990f = n5.a.a(new androidx.biometric.e(obj2, obj3, obj4, 29));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public Object b(Context context, v0.e eVar, kd.c cVar) {
        be.m mVar = new be.m(1, w7.n.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        w0 w0Var = new w0(mVar, 25);
        a3.b bVar = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j c10 = te.b.c(new te.b(this.f15986a), eVar);
        if (c10 == null) {
            w0Var.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            w0Var.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            c10.onCreateCredential(context, eVar, cancellationSignal, bVar, w0Var);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.f16062a;
        return r10;
    }

    public PackageInfo c(int i10, String str) {
        return this.f15986a.getPackageManager().getPackageInfo(str, i10);
    }
}
