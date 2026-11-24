package defpackage;
public final class ll0 implements ml0, x56, sv6, us2 {
    public final byte a;
    public final int b;
    public final int c;

    public ll0(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((ad8) obj).J(this.b, this.c);
                return;
            default:
                ((ad8) obj).s0(this.b, this.c);
                return;
        }
    }

    @Override
    public final void f(ru6 ru6Var, int i) {
        ru6Var.c(i, this.b, this.c);
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((mc8) obj).M(this.b, this.c);
                return;
            default:
                ((mc8) obj).M(this.b, this.c);
                return;
        }
    }

    @Override
    public final int k(wjb wjbVar, boolean z) {
        if (z) {
            return this.b;
        }
        return this.c;
    }
}
