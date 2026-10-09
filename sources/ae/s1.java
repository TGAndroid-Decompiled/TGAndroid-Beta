package ae;
public final class s1 extends ld.i implements sd.p {
    public x1 f496b;
    public q f497c;
    public int d;
    public Object f498e;
    public final w1 f499f;

    public s1(w1 w1Var, jd.c cVar) {
        super(cVar);
        this.f499f = w1Var;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        s1 s1Var = new s1(this.f499f, cVar);
        s1Var.f498e = obj;
        return s1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((s1) create((xd.c) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: ae.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
