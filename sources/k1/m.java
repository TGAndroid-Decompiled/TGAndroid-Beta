package k1;
public final class m extends ld.j implements sd.p {
    public final int f14348a;
    public int f14349b;
    public Object f14350c;
    public final a0 d;

    public m(a0 a0Var, jd.c cVar, int i10) {
        super(2, cVar);
        this.f14348a = i10;
        this.d = a0Var;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.f14348a) {
            case 0:
                m mVar = new m(this.d, cVar, 0);
                mVar.f14350c = obj;
                return mVar;
            default:
                m mVar2 = new m(this.d, cVar, 1);
                mVar2.f14350c = obj;
                return mVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14348a) {
            case 0:
                return ((m) create((k) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
            default:
                return ((m) create((de.c) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
