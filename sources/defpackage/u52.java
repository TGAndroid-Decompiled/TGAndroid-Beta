package defpackage;
public final class u52 extends i98 {
    public boolean a;
    public final int b;
    public final k62 c;

    public u52(k62 k62Var, int i) {
        this.c = k62Var;
        this.b = i;
    }

    @Override
    public final void C() {
        if (this.a) {
            this.c.d0(this.b);
        }
    }

    @Override
    public final void I() {
        this.c.h0(this.b, null);
    }

    @Override
    public final void W() {
        this.a = true;
    }

    @Override
    public final boolean y() {
        return false;
    }
}
