package l1;
public final class v extends hd.j implements od.p {
    public final int f17647a;
    public int f17648b;
    public boolean f17649c;
    public final b0 d;
    public final int f17650e;
    public Object f17651f;

    public v(b0 b0Var, int i3, fd.c cVar, int i10) {
        super(2, cVar);
        this.f17647a = i10;
        this.d = b0Var;
        this.f17650e = i3;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f17647a) {
            case 0:
                v vVar = new v(this.d, this.f17650e, cVar, 0);
                vVar.f17649c = ((Boolean) obj).booleanValue();
                return vVar;
            default:
                v vVar2 = new v(this.d, this.f17650e, cVar, 1);
                vVar2.f17649c = ((Boolean) obj).booleanValue();
                return vVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f17647a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        fd.c cVar = (fd.c) obj2;
        switch (i3) {
            case 0:
                return ((v) create(bool, cVar)).invokeSuspend(dd.k.f8801a);
            default:
                return ((v) create(bool, cVar)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: l1.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
