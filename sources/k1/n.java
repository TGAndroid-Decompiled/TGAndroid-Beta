package k1;
public final class n extends md.i implements td.p {
    public final int f14630a;
    public int f14631b;
    public Object f14632c;
    public final z d;

    public n(z zVar, kd.c cVar, int i10) {
        super(2, cVar);
        this.f14630a = i10;
        this.d = zVar;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f14630a) {
            case 0:
                n nVar = new n(this.d, cVar, 0);
                nVar.f14632c = obj;
                return nVar;
            default:
                n nVar2 = new n(this.d, cVar, 1);
                nVar2.f14632c = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14630a) {
            case 0:
                return ((n) create((k) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
            default:
                return ((n) create((ee.c) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
