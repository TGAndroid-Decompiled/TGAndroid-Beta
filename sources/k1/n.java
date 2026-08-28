package k1;
public final class n extends sc.i implements zc.p {
    public final int f14457a;
    public int f14458b;
    public Object f14459c;
    public final z d;

    public n(z zVar, qc.c cVar, int i9) {
        super(2, cVar);
        this.f14457a = i9;
        this.d = zVar;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.f14457a) {
            case 0:
                n nVar = new n(this.d, cVar, 0);
                nVar.f14459c = obj;
                return nVar;
            default:
                n nVar2 = new n(this.d, cVar, 1);
                nVar2.f14459c = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14457a) {
            case 0:
                return ((n) create((k) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
            default:
                return ((n) create((kd.c) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
