package m1;
public final class v extends kd.j implements rd.p {
    public final int f19491a;
    public int f19492b;
    public boolean f19493c;
    public final b0 d;
    public final int f19494e;
    public Object f19495f;

    public v(b0 b0Var, int i7, id.c cVar, int i10) {
        super(2, cVar);
        this.f19491a = i10;
        this.d = b0Var;
        this.f19494e = i7;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f19491a) {
            case 0:
                v vVar = new v(this.d, this.f19494e, cVar, 0);
                vVar.f19493c = ((Boolean) obj).booleanValue();
                return vVar;
            default:
                v vVar2 = new v(this.d, this.f19494e, cVar, 1);
                vVar2.f19493c = ((Boolean) obj).booleanValue();
                return vVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f19491a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        id.c cVar = (id.c) obj2;
        switch (i7) {
            case 0:
                return ((v) create(bool, cVar)).invokeSuspend(gd.k.f13831a);
            default:
                return ((v) create(bool, cVar)).invokeSuspend(gd.k.f13831a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: m1.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
