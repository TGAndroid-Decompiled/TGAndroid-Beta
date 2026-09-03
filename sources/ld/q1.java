package ld;
public final class q1 extends wc.h implements dd.p {
    public v1 f12023b;
    public q f12024c;
    public int d;
    public Object e;
    public final u1 f12025f;

    public q1(u1 u1Var, uc.c cVar) {
        super(cVar);
        this.f12025f = u1Var;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        q1 q1Var = new q1(this.f12025f, cVar);
        q1Var.e = obj;
        return q1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((id.c) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44318a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: ld.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
