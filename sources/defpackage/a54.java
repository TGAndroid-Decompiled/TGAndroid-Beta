package defpackage;
public final class a54 extends c54 {
    public final va1 c;
    public final e54 d;

    public a54(e54 e54Var, long j, va1 va1Var) {
        super(j);
        this.d = e54Var;
        this.c = va1Var;
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
