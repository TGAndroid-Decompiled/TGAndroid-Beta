package defpackage;
public final class i83 extends yfb implements is4 {
    public final byte a;
    public byte b;
    public boolean c;
    public final o83 d;
    public final int e;
    public Object f;

    public i83(o83 o83Var, int i, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.d = o83Var;
        this.e = i;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        int i = this.e;
        o83 o83Var = this.d;
        switch (b) {
            case 0:
                i83 i83Var = new i83(o83Var, i, zw2Var, (byte) 0);
                i83Var.c = ((Boolean) obj).booleanValue();
                return i83Var;
            default:
                i83 i83Var2 = new i83(o83Var, i, zw2Var, (byte) 1);
                i83Var2.c = ((Boolean) obj).booleanValue();
                return i83Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((i83) create(bool, zw2Var)).invokeSuspend(g9cVar);
            default:
                return ((i83) create(bool, zw2Var)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
