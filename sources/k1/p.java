package k1;
public final class p extends wc.i implements dd.p {
    public final int f9572a;
    public int f9573b;
    public Object f9574c;
    public final d0 d;

    public p(d0 d0Var, uc.c cVar, int i10) {
        super(2, cVar);
        this.f9572a = i10;
        this.d = d0Var;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f9572a) {
            case 0:
                p pVar = new p(this.d, cVar, 0);
                pVar.f9574c = obj;
                return pVar;
            default:
                p pVar2 = new p(this.d, cVar, 1);
                pVar2.f9574c = obj;
                return pVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9572a) {
            case 0:
                return ((p) create((m) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44318a);
            default:
                return ((p) create((od.c) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44318a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
