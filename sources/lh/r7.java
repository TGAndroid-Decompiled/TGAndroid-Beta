package lh;
public final class r7 implements Runnable {
    public final int f13031a;
    public final s7 f13032b;
    public final long f13033c;

    public r7(s7 s7Var, long j10, int i10) {
        this.f13031a = i10;
        this.f13032b = s7Var;
        this.f13033c = j10;
    }

    @Override
    public final void run() {
        switch (this.f13031a) {
            case 0:
                s7 s7Var = this.f13032b;
                s7Var.f13092q.d0(s7Var.f13080b, s7Var.f13081c, this.f13033c, true, true, s7Var.f13089n);
                return;
            default:
                s7 s7Var2 = this.f13032b;
                s7Var2.f13092q.d0(s7Var2.f13080b, s7Var2.f13081c, this.f13033c, true, true, s7Var2.f13089n);
                return;
        }
    }
}
