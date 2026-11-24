package defpackage;
public final class e44 extends g44 {
    public final na1 c;
    public final i44 d;

    public e44(i44 i44Var, long j, na1 na1Var) {
        super(j);
        this.d = i44Var;
        this.c = na1Var;
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
