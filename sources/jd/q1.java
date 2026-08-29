package jd;
public final class q1 extends uc.h implements bd.p {
    public v1 f11513b;
    public q f11514c;
    public int d;
    public Object f11515e;
    public final u1 f11516f;

    public q1(u1 u1Var, sc.c cVar) {
        super(cVar);
        this.f11516f = u1Var;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        q1 q1Var = new q1(this.f11516f, cVar);
        q1Var.f11515e = obj;
        return q1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((gd.c) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: jd.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
