package db;
public final class c1 extends hd.j implements od.p {
    public final int f8622a;
    public Object f8623b;
    public final e1 f8624c;

    public c1(e1 e1Var, fd.c cVar, int i3) {
        super(2, cVar);
        this.f8622a = i3;
        this.f8624c = e1Var;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f8622a) {
            case 0:
                c1 c1Var = new c1(this.f8624c, cVar, 0);
                c1Var.f8623b = obj;
                return c1Var;
            default:
                c1 c1Var2 = new c1(this.f8624c, cVar, 1);
                c1Var2.f8623b = obj;
                return c1Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.f8622a) {
            case 0:
                return ((c1) create(j0Var, cVar)).invokeSuspend(dd.k.f8801a);
            default:
                return ((c1) create(j0Var, cVar)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        throw new UnsupportedOperationException("Method not decompiled: db.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
