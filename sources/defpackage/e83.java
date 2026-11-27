package defpackage;
public final class e83 extends yfb implements is4 {
    public final byte a;
    public byte b;
    public final o83 c;

    public e83(o83 o83Var, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = o83Var;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        o83 o83Var = this.c;
        switch (b) {
            case 0:
                return new e83(o83Var, zw2Var, (byte) 0);
            default:
                return new e83(o83Var, zw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((e83) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
            default:
                return ((e83) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
