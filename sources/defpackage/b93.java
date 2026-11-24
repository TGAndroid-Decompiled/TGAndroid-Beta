package defpackage;
public final class b93 extends eeb implements fs4 {
    public final byte a;
    public byte b;
    public boolean c;
    public final h93 d;
    public final int e;
    public Object f;

    public b93(h93 h93Var, int i, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.d = h93Var;
        this.e = i;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        int i = this.e;
        h93 h93Var = this.d;
        switch (b) {
            case 0:
                b93 b93Var = new b93(h93Var, i, px2Var, (byte) 0);
                b93Var.c = ((Boolean) obj).booleanValue();
                return b93Var;
            default:
                b93 b93Var2 = new b93(h93Var, i, px2Var, (byte) 1);
                b93Var2.c = ((Boolean) obj).booleanValue();
                return b93Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        px2 px2Var = (px2) obj2;
        switch (b) {
            case 0:
                return ((b93) create(bool, px2Var)).invokeSuspend(g7cVar);
            default:
                return ((b93) create(bool, px2Var)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b93.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
