package bi;
public final class r5 implements Runnable {
    public final int f3835a;
    public final y5 f3836b;

    public r5(y5 y5Var, int i7) {
        this.f3835a = i7;
        this.f3836b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f3835a) {
            case 0:
                o5 o5Var = this.f3836b.f4019c;
                if (!o5Var.f3764j.isEmpty()) {
                    o5Var.f3764j.clear();
                    o5Var.h();
                    return;
                }
                return;
            case 1:
                o5 o5Var2 = this.f3836b.f4019c;
                if (!o5Var2.f3765k.isEmpty()) {
                    o5Var2.f3765k.clear();
                    o5Var2.h();
                    return;
                }
                return;
            case 2:
                o5 o5Var3 = this.f3836b.f4019c;
                if (!o5Var3.f3766l.isEmpty()) {
                    o5Var3.f3766l.clear();
                    o5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f3836b.f4019c.i(n5.f3740a);
                return;
            case 4:
                this.f3836b.f4019c.i(n5.f3741b);
                return;
            default:
                this.f3836b.f4019c.i(n5.f3742c);
                return;
        }
    }
}
