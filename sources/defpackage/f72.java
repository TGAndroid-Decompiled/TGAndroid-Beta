package defpackage;
public final class f72 extends jb8 {
    public boolean a;
    public final int b;
    public final v72 c;

    public f72(v72 v72Var, int i) {
        this.c = v72Var;
        this.b = i;
    }

    @Override
    public final void D() {
        if (this.a) {
            this.c.d0(this.b);
        }
    }

    @Override
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override
    public final void X() {
        this.a = true;
    }

    @Override
    public final boolean y() {
        return false;
    }
}
