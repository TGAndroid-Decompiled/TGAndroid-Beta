package gb;
public final class b1 extends kd.j implements rd.p {
    public final int f13296a;
    public Object f13297b;
    public final d1 f13298c;

    public b1(d1 d1Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f13296a = i7;
        this.f13298c = d1Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f13296a) {
            case 0:
                b1 b1Var = new b1(this.f13298c, cVar, 0);
                b1Var.f13297b = obj;
                return b1Var;
            default:
                b1 b1Var2 = new b1(this.f13298c, cVar, 1);
                b1Var2.f13297b = obj;
                return b1Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f13296a) {
            case 0:
                return ((b1) create(j0Var, cVar)).invokeSuspend(gd.k.f13488a);
            default:
                return ((b1) create(j0Var, cVar)).invokeSuspend(gd.k.f13488a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        throw new UnsupportedOperationException("Method not decompiled: gb.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
