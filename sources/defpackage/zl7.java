package defpackage;
public final class zl7 implements Runnable {
    public final byte a;
    public final lm7 b;
    public final int c;
    public final r47 d;

    public zl7(int i, r47 r47Var, lm7 lm7Var) {
        this.a = (byte) 2;
        this.b = lm7Var;
        this.d = r47Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        r47 r47Var = this.d;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                lm7Var.H0(i, r47Var, true);
                return;
            case 1:
                lm7Var.H0(i, r47Var, false);
                return;
            default:
                hl.g(lm7Var.A0(r47Var));
                d31.b0(lm7Var).k(false).j();
                lm7Var.D0(lm7Var.m0(i, r47Var, "forward", "copy_link"));
                return;
        }
    }

    public zl7(lm7 lm7Var, int i, r47 r47Var, byte b) {
        this.a = b;
        this.b = lm7Var;
        this.c = i;
        this.d = r47Var;
    }
}
