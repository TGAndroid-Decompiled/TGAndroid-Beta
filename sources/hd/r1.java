package hd;
public final class r1 extends sc.h implements zc.p {
    public w1 f10479b;
    public q f10480c;
    public int d;
    public Object f10481e;
    public final v1 f10482f;

    public r1(v1 v1Var, qc.c cVar) {
        super(cVar);
        this.f10482f = v1Var;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        r1 r1Var = new r1(this.f10482f, cVar);
        r1Var.f10481e = obj;
        return r1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((ed.c) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: hd.r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
