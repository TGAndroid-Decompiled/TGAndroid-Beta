package defpackage;
public final class p73 extends ccb implements eq4 {
    public final byte a;
    public byte b;
    public boolean c;
    public final v73 d;
    public final int e;
    public Object f;

    public p73(v73 v73Var, int i, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.d = v73Var;
        this.e = i;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        int i = this.e;
        v73 v73Var = this.d;
        switch (b) {
            case 0:
                p73 p73Var = new p73(v73Var, i, fw2Var, (byte) 0);
                p73Var.c = ((Boolean) obj).booleanValue();
                return p73Var;
            default:
                p73 p73Var2 = new p73(v73Var, i, fw2Var, (byte) 1);
                p73Var2.c = ((Boolean) obj).booleanValue();
                return p73Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
            case 0:
                return ((p73) create(bool, fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((p73) create(bool, fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
