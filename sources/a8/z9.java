package a8;
public abstract class z9 {
    public static final Object a(ee.q qVar, ee.q qVar2, rd.p pVar) {
        Object vVar;
        Object D;
        try {
            kotlin.jvm.internal.u.a(2, pVar);
            vVar = pVar.invoke(qVar2, qVar);
        } catch (Throwable th2) {
            vVar = new zd.v(th2, false);
        }
        jd.a aVar = jd.a.f16643a;
        if (vVar != aVar && (D = qVar.D(vVar)) != zd.b0.f59948e) {
            if (!(D instanceof zd.v)) {
                return zd.b0.w(D);
            }
            throw ((zd.v) D).f60022a;
        }
        return aVar;
    }
}
