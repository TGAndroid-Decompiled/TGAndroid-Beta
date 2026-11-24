package defpackage;
public final class x0 implements qac {
    public final byte a;
    public final Object b;
    public final Object c;

    public x0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    private final void b(Object obj) {
        iv1 iv1Var = (iv1) this.c;
        x0 x0Var = (x0) this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        yv1 yv1Var = iv1Var.a;
        if (!booleanValue) {
            c41.b0(yv1Var).I(2131624012, jb6.M0(2131754308, null), jb6.M0(2131754309, null)).j();
            return;
        }
        yv1Var.getMessagesController().M4(true);
        c41.b0(yv1Var).P(2131623982, gm.D2(gm.N2(jb6.M0(2131745308, null), -1, 2, new ru1(iv1Var, (byte) 8), null), true)).k(true);
        x0Var.a(Boolean.TRUE);
    }

    @Override
    public final void a(java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0.a(java.lang.Object):void");
    }
}
