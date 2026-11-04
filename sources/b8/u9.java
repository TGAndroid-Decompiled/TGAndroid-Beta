package b8;
public abstract class u9 {
    public static final Object a(be.q qVar, be.q qVar2, od.p pVar) {
        Object vVar;
        Object D;
        try {
            kotlin.jvm.internal.u.a(2, pVar);
            vVar = pVar.invoke(qVar2, qVar);
        } catch (Throwable th2) {
            vVar = new wd.v(th2, false);
        }
        gd.a aVar = gd.a.f12241a;
        if (vVar != aVar && (D = qVar.D(vVar)) != wd.b0.f57466e) {
            if (!(D instanceof wd.v)) {
                return wd.b0.w(D);
            }
            throw ((wd.v) D).f57540a;
        }
        return aVar;
    }
}
