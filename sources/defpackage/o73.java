package defpackage;
public final class o73 extends ccb implements qp4 {
    public Throwable a;
    public byte b;
    public final v73 c;

    public o73(v73 v73Var, fw2 fw2Var) {
        super(1, fw2Var);
        this.c = v73Var;
    }

    @Override
    public final fw2 create(fw2 fw2Var) {
        return new o73(this.c, fw2Var);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((o73) create((fw2) obj)).invokeSuspend(g5c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
