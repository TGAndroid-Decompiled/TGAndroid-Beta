package defpackage;
public final class ov5 extends fe9 implements is4 {
    public qm7 b;
    public yg2 c;
    public byte d;
    public Object e;
    public final sv5 f;

    public ov5(zw2 zw2Var, sv5 sv5Var) {
        super(2, zw2Var);
        this.f = sv5Var;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        ov5 ov5Var = new ov5(zw2Var, this.f);
        ov5Var.e = obj;
        return ov5Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((ov5) create((g8a) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
