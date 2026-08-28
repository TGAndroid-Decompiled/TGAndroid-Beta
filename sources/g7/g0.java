package g7;
public abstract class g0 {
    public static final Object a(md.s sVar, md.s sVar2, zc.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            vVar = new hd.v(th, false);
        }
        rc.a aVar = rc.a.f47127a;
        if (vVar != aVar && (B = sVar.B(vVar)) != hd.f0.f10433e) {
            if (!(B instanceof hd.v)) {
                return hd.f0.u(B);
            }
            throw ((hd.v) B).f10495a;
        }
        return aVar;
    }
}
