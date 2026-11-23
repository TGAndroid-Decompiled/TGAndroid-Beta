package bi;
public final class a8 implements Runnable {
    public final int f3415a;
    public final h8 f3416b;

    public a8(h8 h8Var, int i7) {
        this.f3415a = i7;
        this.f3416b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f3415a) {
            case 0:
                x7 x7Var = this.f3416b.f3714c;
                if (!x7Var.f4261j.isEmpty()) {
                    x7Var.f4261j.clear();
                    x7Var.m();
                    return;
                }
                return;
            case 1:
                x7 x7Var2 = this.f3416b.f3714c;
                if (!x7Var2.f4262k.isEmpty()) {
                    x7Var2.f4262k.clear();
                    x7Var2.m();
                    return;
                }
                return;
            case 2:
                x7 x7Var3 = this.f3416b.f3714c;
                if (!x7Var3.f4263l.isEmpty()) {
                    x7Var3.f4263l.clear();
                    x7Var3.m();
                    return;
                }
                return;
            case 3:
                this.f3416b.f3714c.p(w7.f4230a);
                return;
            case 4:
                this.f3416b.f3714c.p(w7.f4231b);
                return;
            default:
                this.f3416b.f3714c.p(w7.f4232c);
                return;
        }
    }
}
