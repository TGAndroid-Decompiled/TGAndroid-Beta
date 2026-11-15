package m1;
public final class v extends kd.j implements rd.p {
    public final int f20080a;
    public int f20081b;
    public boolean f20082c;
    public final b0 d;
    public final int f20083e;
    public Object f20084f;

    public v(b0 b0Var, int i7, id.c cVar, int i10) {
        super(2, cVar);
        this.f20080a = i10;
        this.d = b0Var;
        this.f20083e = i7;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f20080a) {
            case 0:
                v vVar = new v(this.d, this.f20083e, cVar, 0);
                vVar.f20082c = ((Boolean) obj).booleanValue();
                return vVar;
            default:
                v vVar2 = new v(this.d, this.f20083e, cVar, 1);
                vVar2.f20082c = ((Boolean) obj).booleanValue();
                return vVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f20080a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        id.c cVar = (id.c) obj2;
        switch (i7) {
            case 0:
                return ((v) create(bool, cVar)).invokeSuspend(gd.k.f13173a);
            default:
                return ((v) create(bool, cVar)).invokeSuspend(gd.k.f13173a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: m1.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
