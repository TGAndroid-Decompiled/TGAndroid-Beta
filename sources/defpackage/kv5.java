package defpackage;
public final class kv5 extends rc9 implements fs4 {
    public ul7 b;
    public uh2 c;
    public byte d;
    public Object e;
    public final ov5 f;

    public kv5(px2 px2Var, ov5 ov5Var) {
        super(2, px2Var);
        this.f = ov5Var;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        kv5 kv5Var = new kv5(px2Var, this.f);
        kv5Var.e = obj;
        return kv5Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((kv5) create((q6a) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
