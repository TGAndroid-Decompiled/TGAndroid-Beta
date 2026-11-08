package m1;
public final class v extends kd.j implements rd.p {
    public final int f19486a;
    public int f19487b;
    public boolean f19488c;
    public final b0 d;
    public final int f19489e;
    public Object f19490f;

    public v(b0 b0Var, int i7, id.c cVar, int i10) {
        super(2, cVar);
        this.f19486a = i10;
        this.d = b0Var;
        this.f19489e = i7;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f19486a) {
            case 0:
                v vVar = new v(this.d, this.f19489e, cVar, 0);
                vVar.f19488c = ((Boolean) obj).booleanValue();
                return vVar;
            default:
                v vVar2 = new v(this.d, this.f19489e, cVar, 1);
                vVar2.f19488c = ((Boolean) obj).booleanValue();
                return vVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f19486a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        id.c cVar = (id.c) obj2;
        switch (i7) {
            case 0:
                return ((v) create(bool, cVar)).invokeSuspend(gd.k.f13829a);
            default:
                return ((v) create(bool, cVar)).invokeSuspend(gd.k.f13829a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: m1.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
