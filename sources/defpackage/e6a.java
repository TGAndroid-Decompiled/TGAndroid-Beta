package defpackage;
public final class e6a extends ccb implements eq4 {
    public ko5 a;
    public g6a b;
    public d6a c;
    public jg4 d;
    public a6a e;
    public k7a f;
    public byte h;
    public final g6a n;
    public final a6a r;

    public e6a(g6a g6aVar, a6a a6aVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.n = g6aVar;
        this.r = a6aVar;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new e6a(this.n, this.r, fw2Var);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e6a) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
