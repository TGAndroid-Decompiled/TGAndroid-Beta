package defpackage;
public final class lm0 implements mm0, x76, sx6, fu2 {
    public final byte a;
    public final int b;
    public final int c;

    public lm0(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((cf8) obj).J(this.b, this.c);
                return;
            default:
                ((cf8) obj).s0(this.b, this.c);
                return;
        }
    }

    @Override
    public final void d(rw6 rw6Var, int i) {
        rw6Var.c(i, this.b, this.c);
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((pe8) obj).M(this.b, this.c);
                return;
            default:
                ((pe8) obj).M(this.b, this.c);
                return;
        }
    }

    @Override
    public final int o(ylb ylbVar, boolean z) {
        if (z) {
            return this.b;
        }
        return this.c;
    }
}
