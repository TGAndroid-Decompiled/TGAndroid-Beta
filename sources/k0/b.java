package k0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import c2.t;
import j4.c;
import n5.e0;
import v9.d;
import w2.j;
import w2.m;
import w4.e;
public final class b {
    public Context f14435a;

    public b(Context context) {
        this.f14435a = context;
    }

    public void a(c cVar, t tVar, xa.c cVar2) {
        CancellationSignal cancellationSignal;
        FingerprintManager f10;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (((CancellationSignal) tVar.f2234c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        tVar.f2234c = cancellationSignal2;
                        if (tVar.f2233b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) tVar.f2234c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (f10 = e0.b.f(this.f14435a)) != null) {
            e0.b.a(f10, e0.b.C(cVar), cancellationSignal, new a(cVar2));
        }
    }

    public j b() {
        Context context = this.f14435a;
        if (context != null) {
            ?? obj = new Object();
            obj.f48457a = y2.a.a(m.f48464a);
            e0 e0Var = new e0(context, 26);
            obj.f48458b = e0Var;
            obj.f48459c = y2.a.a(new e(2, e0Var, new e0(e0Var, 25)));
            e0 e0Var2 = obj.f48458b;
            obj.d = new fa.c(e0Var2, 11);
            nc.a a2 = y2.a.a(new we.b(obj.d, y2.a.a(new xa.c(e0Var2, 11)), false, 18));
            obj.f48460e = a2;
            d dVar = new d(3);
            e0 e0Var3 = obj.f48458b;
            a5.m mVar = new a5.m(e0Var3, a2, dVar, 5);
            nc.a aVar = obj.f48457a;
            nc.a aVar2 = obj.f48459c;
            ?? obj2 = new Object();
            obj2.f1413a = aVar;
            obj2.f1414b = aVar2;
            obj2.f1416e = mVar;
            obj2.f1415c = a2;
            obj2.d = a2;
            ?? obj3 = new Object();
            obj3.f17098a = e0Var3;
            obj3.f17099b = aVar2;
            obj3.f17100c = a2;
            obj3.d = mVar;
            obj3.f17101e = aVar;
            obj3.f17102f = a2;
            obj3.h = a2;
            obj.f48461f = y2.a.a(new t5.c((Object) obj2, (Object) obj3, new com.google.firebase.messaging.t(aVar, a2, mVar, a2, 5), 5));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
