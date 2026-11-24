package defpackage;
public final class l73 extends ccb implements eq4 {
    public final byte a;
    public byte b;
    public final v73 c;

    public l73(v73 v73Var, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = v73Var;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        v73 v73Var = this.c;
        switch (b) {
            case 0:
                return new l73(v73Var, fw2Var, (byte) 0);
            default:
                return new l73(v73Var, fw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
            case 0:
                return ((l73) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((l73) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
