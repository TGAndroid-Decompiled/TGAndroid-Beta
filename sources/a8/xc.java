package a8;
public abstract class xc {
    public static final Object a(he.s sVar, he.s sVar2, ud.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new ce.v(th2, false);
        }
        md.a aVar = md.a.f18412a;
        if (vVar != aVar && (B = sVar.B(vVar)) != ce.f0.e) {
            if (!(B instanceof ce.v)) {
                return ce.f0.u(B);
            }
            throw ((ce.v) B).f6271a;
        }
        return aVar;
    }
}
