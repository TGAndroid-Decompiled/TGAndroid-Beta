package defpackage;
public final class g93 extends eeb implements fs4 {
    public c79 a;
    public byte b;
    public Object c;
    public final c79 d;
    public final h93 e;
    public final Object f;
    public final boolean h;

    public g93(c79 c79Var, h93 h93Var, Object obj, boolean z, px2 px2Var) {
        super(2, px2Var);
        this.d = c79Var;
        this.e = h93Var;
        this.f = obj;
        this.h = z;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        g93 g93Var = new g93(this.d, this.e, this.f, this.h, px2Var);
        g93Var.c = obj;
        return g93Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((g93) create((sd4) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g93.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
