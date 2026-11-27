package defpackage;
public final class h83 extends yfb implements ur4 {
    public Throwable a;
    public byte b;
    public final o83 c;

    public h83(o83 o83Var, zw2 zw2Var) {
        super(1, zw2Var);
        this.c = o83Var;
    }

    @Override
    public final zw2 create(zw2 zw2Var) {
        return new h83(this.c, zw2Var);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((h83) create((zw2) obj)).invokeSuspend(g9c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
