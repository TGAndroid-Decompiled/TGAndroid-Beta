package defpackage;
public final class w9a extends yfb implements is4 {
    public oq5 a;
    public y9a b;
    public v9a c;
    public ji4 d;
    public s9a e;
    public bba f;
    public byte h;
    public final y9a n;
    public final s9a r;

    public w9a(y9a y9aVar, s9a s9aVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.n = y9aVar;
        this.r = s9aVar;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new w9a(this.n, this.r, zw2Var);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((w9a) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
