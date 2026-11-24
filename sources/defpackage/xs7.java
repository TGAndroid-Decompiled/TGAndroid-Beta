package defpackage;
public final class xs7 implements nv8 {
    public static final bh7 c = new bh7((byte) 8);
    public static final nr2 d = new nr2((byte) 6);
    public ke3 a;
    public volatile nv8 b;

    public xs7(bh7 bh7Var, nv8 nv8Var) {
        this.a = bh7Var;
        this.b = nv8Var;
    }

    public final void a(ke3 ke3Var) {
        nv8 nv8Var;
        nv8 nv8Var2;
        nv8 nv8Var3 = this.b;
        nr2 nr2Var = d;
        if (nv8Var3 != nr2Var) {
            ke3Var.f(nv8Var3);
            return;
        }
        synchronized (this) {
            nv8Var = this.b;
            if (nv8Var != nr2Var) {
                nv8Var2 = nv8Var;
            } else {
                this.a = new cz6(this.a, ke3Var, (byte) 7);
                nv8Var2 = null;
            }
        }
        if (nv8Var2 != null) {
            ke3Var.f(nv8Var);
        }
    }

    @Override
    public final Object get() {
        return this.b.get();
    }
}
