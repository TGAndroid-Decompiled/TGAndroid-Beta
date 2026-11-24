package defpackage;
public final class a93 extends eeb implements rr4 {
    public Throwable a;
    public byte b;
    public final h93 c;

    public a93(h93 h93Var, px2 px2Var) {
        super(1, px2Var);
        this.c = h93Var;
    }

    @Override
    public final px2 create(px2 px2Var) {
        return new a93(this.c, px2Var);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((a93) create((px2) obj)).invokeSuspend(g7c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a93.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
