package bi;
public final class r5 implements Runnable {
    public final int f3832a;
    public final y5 f3833b;

    public r5(y5 y5Var, int i7) {
        this.f3832a = i7;
        this.f3833b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f3832a) {
            case 0:
                o5 o5Var = this.f3833b.f4016c;
                if (!o5Var.f3761j.isEmpty()) {
                    o5Var.f3761j.clear();
                    o5Var.h();
                    return;
                }
                return;
            case 1:
                o5 o5Var2 = this.f3833b.f4016c;
                if (!o5Var2.f3762k.isEmpty()) {
                    o5Var2.f3762k.clear();
                    o5Var2.h();
                    return;
                }
                return;
            case 2:
                o5 o5Var3 = this.f3833b.f4016c;
                if (!o5Var3.f3763l.isEmpty()) {
                    o5Var3.f3763l.clear();
                    o5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f3833b.f4016c.i(n5.f3737a);
                return;
            case 4:
                this.f3833b.f4016c.i(n5.f3738b);
                return;
            default:
                this.f3833b.f4016c.i(n5.f3739c);
                return;
        }
    }
}
