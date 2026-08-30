package k7;
public abstract class g7 {
    public static final Object a(qd.s sVar, qd.s sVar2, dd.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new ld.v(th2, false);
        }
        vc.a aVar = vc.a.f45663a;
        if (vVar != aVar && (B = sVar.B(vVar)) != ld.e0.e) {
            if (!(B instanceof ld.v)) {
                return ld.e0.u(B);
            }
            throw ((ld.v) B).f11930a;
        }
        return aVar;
    }
}
