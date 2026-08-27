package ka;

import android.content.Context;
import android.os.Bundle;
import h7.k6;
import h7.o;
import ia.g0;
import ia.t;

public final class h {

    public static final f f15124c = new f();
    public static final m1.c d = o.a(t.f11078b);

    public final android.support.v4.media.c f15125a;

    public final d f15126b;

    public h(t8.h hVar, rc.h hVar2, rc.h hVar3, z9.d dVar) {
        hVar.a();
        Context context = hVar.f48119a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        g0 g0Var = g0.f11012a;
        ia.b bVarA = g0.a(hVar);
        android.support.v4.media.c cVar = new android.support.v4.media.c(context);
        j9.a aVar = new j9.a(bVarA, hVar2);
        f15124c.getClass();
        d dVar2 = new d(hVar3, dVar, bVarA, aVar, d.a(context, f.f15120a[0]));
        this.f15125a = cVar;
        this.f15126b = dVar2;
    }

    public final double a() {
        Bundle bundle = this.f15125a.f789a;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        e eVar = this.f15126b.f15115c.f15138b;
        if (eVar == null) {
            kotlin.jvm.internal.j.h("sessionConfigs");
            throw null;
        }
        Double d10 = eVar.f15117b;
        if (d10 != null) {
            double dDoubleValue2 = d10.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    public final Object b(tc.c cVar) {
        g gVar;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.d = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f15122b;
        sc.a aVar = sc.a.f47847a;
        int i11 = gVar.d;
        pc.i iVar = pc.i.f45696a;
        if (i11 != 0) {
            if (i11 == 1) {
                hVar = gVar.f15121a;
                k6.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k6.b(obj);
            }
        }
        k6.b(obj);
        gVar.f15121a = this;
        gVar.d = 1;
        this.f15125a.getClass();
        if (iVar != aVar) {
            hVar = this;
        }
        d dVar = hVar.f15126b;
        gVar.f15121a = null;
        gVar.d = 2;
        return dVar.c(gVar) == aVar ? aVar : iVar;
    }
}
