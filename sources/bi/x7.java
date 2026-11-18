package bi;
public final class x7 implements Runnable {
    public final int f4188a;
    public final e8 f4189b;

    public x7(e8 e8Var, int i7) {
        this.f4188a = i7;
        this.f4189b = e8Var;
    }

    @Override
    public final void run() {
        switch (this.f4188a) {
            case 0:
                u7 u7Var = this.f4189b.f3554c;
                if (!u7Var.f4094j.isEmpty()) {
                    u7Var.f4094j.clear();
                    u7Var.m();
                    return;
                }
                return;
            case 1:
                u7 u7Var2 = this.f4189b.f3554c;
                if (!u7Var2.f4095k.isEmpty()) {
                    u7Var2.f4095k.clear();
                    u7Var2.m();
                    return;
                }
                return;
            case 2:
                u7 u7Var3 = this.f4189b.f3554c;
                if (!u7Var3.f4096l.isEmpty()) {
                    u7Var3.f4096l.clear();
                    u7Var3.m();
                    return;
                }
                return;
            case 3:
                this.f4189b.f3554c.p(t7.f4068a);
                return;
            case 4:
                this.f4189b.f3554c.p(t7.f4069b);
                return;
            default:
                this.f4189b.f3554c.p(t7.f4070c);
                return;
        }
    }
}
