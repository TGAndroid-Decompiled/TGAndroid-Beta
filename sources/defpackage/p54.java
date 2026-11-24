package defpackage;
public final class p54 extends r54 {
    public final vb1 c;
    public final t54 d;

    public p54(t54 t54Var, long j, vb1 vb1Var) {
        super(j);
        this.d = t54Var;
        this.c = vb1Var;
    }

    @Override
    public final void run() {
        this.c.C(this.d);
    }

    @Override
    public final String toString() {
        return super.toString() + this.c;
    }
}
