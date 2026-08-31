package k0;

import a3.c;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.biometric.e;
import c2.u;
import o5.i;
import q5.g0;
import y2.j;
import y2.m;
import y5.h;
import z2.d;
public final class b {
    public Context f10247a;

    public b(Context context) {
        this.f10247a = context;
    }

    public void a(e eVar, u uVar, h hVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager f10;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.f2180c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        uVar.f2180c = cancellationSignal2;
                        if (uVar.f2179b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) uVar.f2180c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (f10 = e0.b.f(this.f10247a)) != null) {
            e0.b.a(f10, e0.b.C(eVar), cancellationSignal, new a(hVar));
        }
    }

    public j b() {
        Context context = this.f10247a;
        if (context != null) {
            ?? obj = new Object();
            obj.f50696a = a3.a.a(m.f50703a);
            c cVar = new c(context);
            obj.f50697b = cVar;
            obj.f50698c = a3.a.a(new g0(20, cVar, new d(cVar)));
            c cVar2 = obj.f50697b;
            obj.d = new h(cVar2, 15);
            rc.a a2 = a3.a.a(new bf.b(29, obj.d, a3.a.a(new i(cVar2, 12))));
            obj.f50699e = a2;
            db.a aVar = new db.a(4);
            c cVar3 = obj.f50697b;
            e eVar = new e(cVar3, a2, aVar, 12);
            rc.a aVar2 = obj.f50696a;
            rc.a aVar3 = obj.f50698c;
            ?? obj2 = new Object();
            obj2.f2315a = aVar2;
            obj2.f2316b = aVar3;
            obj2.f2317c = eVar;
            obj2.d = a2;
            obj2.f2318e = a2;
            ?? obj3 = new Object();
            obj3.f13327a = cVar3;
            obj3.f13328b = aVar3;
            obj3.f13329c = a2;
            obj3.d = eVar;
            obj3.f13330e = aVar2;
            obj3.f13331f = a2;
            obj3.h = a2;
            obj.f50700f = a3.a.a(new s5.m((Object) obj2, (Object) obj3, new sf.e(aVar2, a2, eVar, a2, 3), 11));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
