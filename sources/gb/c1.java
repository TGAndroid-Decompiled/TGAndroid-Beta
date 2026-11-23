package gb;
public final class c1 extends kd.j implements rd.p {
    public final int f13296a;
    public Object f13297b;
    public final e1 f13298c;

    public c1(e1 e1Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f13296a = i7;
        this.f13298c = e1Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f13296a) {
            case 0:
                c1 c1Var = new c1(this.f13298c, cVar, 0);
                c1Var.f13297b = obj;
                return c1Var;
            default:
                c1 c1Var2 = new c1(this.f13298c, cVar, 1);
                c1Var2.f13297b = obj;
                return c1Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f13296a) {
            case 0:
                return ((c1) create(k0Var, cVar)).invokeSuspend(gd.k.f13480a);
            default:
                return ((c1) create(k0Var, cVar)).invokeSuspend(gd.k.f13480a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        throw new UnsupportedOperationException("Method not decompiled: gb.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
