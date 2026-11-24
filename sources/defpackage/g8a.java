package defpackage;
public final class g8a extends eeb implements fs4 {
    public kq5 a;
    public i8a b;
    public f8a c;
    public li4 d;
    public c8a e;
    public l9a f;
    public byte h;
    public final i8a n;
    public final c8a r;

    public g8a(i8a i8aVar, c8a c8aVar, px2 px2Var) {
        super(2, px2Var);
        this.n = i8aVar;
        this.r = c8aVar;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        return new g8a(this.n, this.r, px2Var);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((g8a) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
