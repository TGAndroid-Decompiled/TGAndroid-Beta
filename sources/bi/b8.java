package bi;
public final class b8 implements Runnable {
    public final int f3442a;
    public final i8 f3443b;

    public b8(i8 i8Var, int i7) {
        this.f3442a = i7;
        this.f3443b = i8Var;
    }

    @Override
    public final void run() {
        switch (this.f3442a) {
            case 0:
                y7 y7Var = this.f3443b.f3731c;
                if (!y7Var.f4300j.isEmpty()) {
                    y7Var.f4300j.clear();
                    y7Var.m();
                    return;
                }
                return;
            case 1:
                y7 y7Var2 = this.f3443b.f3731c;
                if (!y7Var2.f4301k.isEmpty()) {
                    y7Var2.f4301k.clear();
                    y7Var2.m();
                    return;
                }
                return;
            case 2:
                y7 y7Var3 = this.f3443b.f3731c;
                if (!y7Var3.f4302l.isEmpty()) {
                    y7Var3.f4302l.clear();
                    y7Var3.m();
                    return;
                }
                return;
            case 3:
                this.f3443b.f3731c.p(x7.f4253a);
                return;
            case 4:
                this.f3443b.f3731c.p(x7.f4254b);
                return;
            default:
                this.f3443b.f3731c.p(x7.f4255c);
                return;
        }
    }
}
