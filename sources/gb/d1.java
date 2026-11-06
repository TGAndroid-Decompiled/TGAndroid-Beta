package gb;
public final class d1 extends kd.j implements rd.p {
    public final int f13656a;
    public Object f13657b;
    public final f1 f13658c;

    public d1(f1 f1Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f13656a = i7;
        this.f13658c = f1Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f13656a) {
            case 0:
                d1 d1Var = new d1(this.f13658c, cVar, 0);
                d1Var.f13657b = obj;
                return d1Var;
            default:
                d1 d1Var2 = new d1(this.f13658c, cVar, 1);
                d1Var2.f13657b = obj;
                return d1Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f13656a) {
            case 0:
                return ((d1) create(k0Var, cVar)).invokeSuspend(gd.k.f13829a);
            default:
                return ((d1) create(k0Var, cVar)).invokeSuspend(gd.k.f13829a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        throw new UnsupportedOperationException("Method not decompiled: gb.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
