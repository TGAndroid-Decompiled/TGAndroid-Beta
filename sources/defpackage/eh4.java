package defpackage;
public final class eh4 extends ccb implements eq4 {
    public final byte a;
    public byte b;
    public Object c;
    public final Object d;

    public eh4(Object obj, Object obj2, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new eh4((fh4) this.c, (i7a) obj2, fw2Var, (byte) 0);
            case 1:
                return new eh4((fga) this.c, (w5a) obj2, fw2Var, (byte) 1);
            default:
                return new eh4((c5a) obj2, fw2Var);
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
                return ((eh4) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
            case 1:
                return ((eh4) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((eh4) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public eh4(c5a c5aVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.a = (byte) 2;
        this.d = c5aVar;
    }
}
