package k1;
public final class m extends kd.j implements rd.p {
    public final int f12018a;
    public int f12019b;
    public Object f12020c;
    public final a0 d;

    public m(a0 a0Var, id.c cVar, int i10) {
        super(2, cVar);
        this.f12018a = i10;
        this.d = a0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f12018a) {
            case 0:
                m mVar = new m(this.d, cVar, 0);
                mVar.f12020c = obj;
                return mVar;
            default:
                m mVar2 = new m(this.d, cVar, 1);
                mVar2.f12020c = obj;
                return mVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12018a) {
            case 0:
                return ((m) create((k) obj, (id.c) obj2)).invokeSuspend(gd.i.f8748a);
            default:
                return ((m) create((ce.c) obj, (id.c) obj2)).invokeSuspend(gd.i.f8748a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
