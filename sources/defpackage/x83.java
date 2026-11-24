package defpackage;
public final class x83 extends eeb implements fs4 {
    public final byte a;
    public byte b;
    public final h93 c;

    public x83(h93 h93Var, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = h93Var;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        h93 h93Var = this.c;
        switch (b) {
            case 0:
                return new x83(h93Var, px2Var, (byte) 0);
            default:
                return new x83(h93Var, px2Var, (byte) 1);
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
                return ((x83) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
            default:
                return ((x83) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
