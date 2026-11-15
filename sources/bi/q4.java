package bi;
public final class q4 implements Runnable {
    public final int f3808a;
    public final a6 f3809b;

    public q4(a6 a6Var, int i7) {
        this.f3808a = i7;
        this.f3809b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f3808a) {
            case 0:
                o5 o5Var = this.f3809b.d;
                if (!o5Var.f3764j.isEmpty()) {
                    o5Var.f3764j.clear();
                    o5Var.h();
                    return;
                }
                return;
            case 1:
                o5 o5Var2 = this.f3809b.d;
                if (!o5Var2.f3765k.isEmpty()) {
                    o5Var2.f3765k.clear();
                    o5Var2.h();
                    return;
                }
                return;
            case 2:
                this.f3809b.d.i(n5.f3740a);
                return;
            case 3:
                this.f3809b.d.i(n5.f3741b);
                return;
            case 4:
                this.f3809b.d.i(n5.f3742c);
                return;
            default:
                o5 o5Var3 = this.f3809b.d;
                if (!o5Var3.f3766l.isEmpty()) {
                    o5Var3.f3766l.clear();
                    o5Var3.h();
                    return;
                }
                return;
        }
    }
}
