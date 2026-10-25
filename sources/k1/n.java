package k1;
public final class n extends nd.i implements ud.p {
    public final int f16063a;
    public int f16064b;
    public Object f16065c;
    public final z d;

    public n(z zVar, ld.c cVar, int i10) {
        super(2, cVar);
        this.f16063a = i10;
        this.d = zVar;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        switch (this.f16063a) {
            case 0:
                n nVar = new n(this.d, cVar, 0);
                nVar.f16065c = obj;
                return nVar;
            default:
                n nVar2 = new n(this.d, cVar, 1);
                nVar2.f16065c = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16063a) {
            case 0:
                return ((n) create((k) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
            default:
                return ((n) create((fe.c) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
