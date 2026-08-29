package k0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.biometric.e;
import c2.u;
import com.google.firebase.messaging.s;
import ha.c;
import v5.n;
import y2.j;
import y2.m;
public final class b {
    public Context f13245a;

    public b(Context context) {
        this.f13245a = context;
    }

    public void a(e eVar, u uVar, c cVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager f9;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.f2912c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        uVar.f2912c = cancellationSignal2;
                        if (uVar.f2911b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) uVar.f2912c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (f9 = e0.b.f(this.f13245a)) != null) {
            e0.b.a(f9, e0.b.C(eVar), cancellationSignal, new a(cVar));
        }
    }

    public j b() {
        Context context = this.f13245a;
        if (context != null) {
            ?? obj = new Object();
            obj.f50190a = a3.a.a(m.f50197a);
            a3.c cVar = new a3.c(context);
            obj.f50191b = cVar;
            obj.f50192c = a3.a.a(new n(9, cVar, new org.telegram.ui.Components.n(cVar, 24)));
            a3.c cVar2 = obj.f50191b;
            obj.d = new c(cVar2, 17);
            pc.a a2 = a3.a.a(new ze.b(obj.d, a3.a.a(new za.c(cVar2, 14))));
            obj.f50193e = a2;
            ya.a aVar = new ya.a(4);
            a3.c cVar3 = obj.f50191b;
            e eVar = new e(cVar3, a2, aVar, 8);
            pc.a aVar2 = obj.f50190a;
            pc.a aVar3 = obj.f50192c;
            ?? obj2 = new Object();
            obj2.f211a = aVar2;
            obj2.f212b = aVar3;
            obj2.f213c = eVar;
            obj2.d = a2;
            obj2.f214e = a2;
            ?? obj3 = new Object();
            obj3.f16688a = cVar3;
            obj3.f16689b = aVar3;
            obj3.f16690c = a2;
            obj3.d = eVar;
            obj3.f16691e = aVar2;
            obj3.f16692f = a2;
            obj3.h = a2;
            obj.f50194f = a3.a.a(new v5.c((Object) obj2, (Object) obj3, new s(aVar2, a2, eVar, a2, 7), 5));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
