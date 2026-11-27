package defpackage;
public final class k83 extends yfb implements ur4 {
    public final byte a = 1;
    public byte b;
    public final o83 c;
    public Object d;
    public final Object e;
    public final Object f;

    public k83(p89 p89Var, o83 o83Var, n89 n89Var, zw2 zw2Var) {
        super(1, zw2Var);
        this.e = p89Var;
        this.c = o83Var;
        this.f = n89Var;
    }

    @Override
    public final zw2 create(zw2 zw2Var) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        o83 o83Var = this.c;
        switch (b) {
            case 0:
                return new k83((p89) obj2, o83Var, (n89) obj, zw2Var);
            default:
                return new k83(o83Var, (mx2) obj2, (is4) obj, zw2Var);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        zw2 zw2Var = (zw2) obj;
        switch (b) {
            case 0:
                return ((k83) create(zw2Var)).invokeSuspend(g9cVar);
            default:
                return ((k83) create(zw2Var)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k83.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public k83(o83 o83Var, mx2 mx2Var, is4 is4Var, zw2 zw2Var) {
        super(1, zw2Var);
        this.c = o83Var;
        this.e = mx2Var;
        this.f = is4Var;
    }
}
