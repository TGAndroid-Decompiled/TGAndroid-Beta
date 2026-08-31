package mh;
public final class r7 implements Runnable {
    public final int f14694a;
    public final s7 f14695b;
    public final long f14696c;

    public r7(s7 s7Var, long j10, int i10) {
        this.f14694a = i10;
        this.f14695b = s7Var;
        this.f14696c = j10;
    }

    @Override
    public final void run() {
        switch (this.f14694a) {
            case 0:
                s7 s7Var = this.f14695b;
                s7Var.f14762q.d0(s7Var.f14749b, s7Var.f14750c, this.f14696c, true, true, s7Var.f14759n);
                return;
            default:
                s7 s7Var2 = this.f14695b;
                s7Var2.f14762q.d0(s7Var2.f14749b, s7Var2.f14750c, this.f14696c, true, true, s7Var2.f14759n);
                return;
        }
    }
}
