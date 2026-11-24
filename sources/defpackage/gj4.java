package defpackage;
public final class gj4 extends eeb implements fs4 {
    public final byte a;
    public byte b;
    public Object c;
    public final Object d;

    public gj4(Object obj, Object obj2, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new gj4((hj4) this.c, (j9a) obj2, px2Var, (byte) 0);
            case 1:
                return new gj4((hia) this.c, (y7a) obj2, px2Var, (byte) 1);
            default:
                return new gj4((xvc) obj2, px2Var);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
            case 0:
                return ((gj4) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
            case 1:
                return ((gj4) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
            default:
                return ((gj4) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public gj4(xvc xvcVar, px2 px2Var) {
        super(2, px2Var);
        this.a = (byte) 2;
        this.d = xvcVar;
    }
}
