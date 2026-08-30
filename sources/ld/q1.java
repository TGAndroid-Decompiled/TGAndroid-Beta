package ld;
public final class q1 extends wc.h implements dd.p {
    public v1 f11913b;
    public q f11914c;
    public int d;
    public Object e;
    public final u1 f11915f;

    public q1(u1 u1Var, uc.c cVar) {
        super(cVar);
        this.f11915f = u1Var;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        q1 q1Var = new q1(this.f11915f, cVar);
        q1Var.e = obj;
        return q1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((id.c) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: ld.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
