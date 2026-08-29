package jh;
public final class q7 implements Runnable {
    public final int f12666a;
    public final r7 f12667b;
    public final long f12668c;

    public q7(r7 r7Var, long j10, int i10) {
        this.f12666a = i10;
        this.f12667b = r7Var;
        this.f12668c = j10;
    }

    @Override
    public final void run() {
        switch (this.f12666a) {
            case 0:
                r7 r7Var = this.f12667b;
                r7Var.f12730q.d0(r7Var.f12717b, r7Var.f12718c, this.f12668c, true, true, r7Var.f12727n);
                return;
            default:
                r7 r7Var2 = this.f12667b;
                r7Var2.f12730q.d0(r7Var2.f12717b, r7Var2.f12718c, this.f12668c, true, true, r7Var2.f12727n);
                return;
        }
    }
}
