package h7;

public abstract class i0 {
    public static final Object a(nd.s sVar, nd.s sVar2, ad.p pVar) {
        Object vVar;
        Object objB;
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            vVar = new id.v(th, false);
        }
        sc.a aVar = sc.a.f47847a;
        if (vVar == aVar || (objB = sVar.B(vVar)) == id.f0.f11142e) {
            return aVar;
        }
        if (objB instanceof id.v) {
            throw ((id.v) objB).f11204a;
        }
        return id.f0.u(objB);
    }
}
