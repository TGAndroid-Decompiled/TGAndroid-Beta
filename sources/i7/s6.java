package i7;
public abstract class s6 {
    public static final Object a(od.t tVar, od.t tVar2, bd.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(tVar2, tVar);
        } catch (Throwable th2) {
            vVar = new jd.v(th2, false);
        }
        tc.a aVar = tc.a.f48210a;
        if (vVar != aVar && (B = tVar.B(vVar)) != jd.e0.f11463e) {
            if (!(B instanceof jd.v)) {
                return jd.e0.u(B);
            }
            throw ((jd.v) B).f11532a;
        }
        return aVar;
    }
}
