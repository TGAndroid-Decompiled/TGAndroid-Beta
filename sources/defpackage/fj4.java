package defpackage;
public final class fj4 extends yfb implements is4 {
    public final byte a;
    public byte b;
    public Object c;
    public final Object d;

    public fj4(Object obj, Object obj2, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new fj4((gj4) this.c, (zaa) obj2, zw2Var, (byte) 0);
            case 1:
                return new fj4((yja) this.c, (o9a) obj2, zw2Var, (byte) 1);
            default:
                return new fj4((lyc) obj2, zw2Var);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((fj4) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
            case 1:
                return ((fj4) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
            default:
                return ((fj4) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public fj4(lyc lycVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.a = (byte) 2;
        this.d = lycVar;
    }
}
