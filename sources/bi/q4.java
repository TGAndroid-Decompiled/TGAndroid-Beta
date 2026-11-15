package bi;
public final class q4 implements Runnable {
    public final int f3805a;
    public final a6 f3806b;

    public q4(a6 a6Var, int i7) {
        this.f3805a = i7;
        this.f3806b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f3805a) {
            case 0:
                o5 o5Var = this.f3806b.d;
                if (!o5Var.f3761j.isEmpty()) {
                    o5Var.f3761j.clear();
                    o5Var.h();
                    return;
                }
                return;
            case 1:
                o5 o5Var2 = this.f3806b.d;
                if (!o5Var2.f3762k.isEmpty()) {
                    o5Var2.f3762k.clear();
                    o5Var2.h();
                    return;
                }
                return;
            case 2:
                this.f3806b.d.i(n5.f3737a);
                return;
            case 3:
                this.f3806b.d.i(n5.f3738b);
                return;
            case 4:
                this.f3806b.d.i(n5.f3739c);
                return;
            default:
                o5 o5Var3 = this.f3806b.d;
                if (!o5Var3.f3763l.isEmpty()) {
                    o5Var3.f3763l.clear();
                    o5Var3.h();
                    return;
                }
                return;
        }
    }
}
