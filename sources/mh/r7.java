package mh;
public final class r7 implements Runnable {
    public final int f14696a;
    public final s7 f14697b;
    public final long f14698c;

    public r7(s7 s7Var, long j10, int i10) {
        this.f14696a = i10;
        this.f14697b = s7Var;
        this.f14698c = j10;
    }

    @Override
    public final void run() {
        switch (this.f14696a) {
            case 0:
                s7 s7Var = this.f14697b;
                s7Var.f14764q.d0(s7Var.f14751b, s7Var.f14752c, this.f14698c, true, true, s7Var.f14761n);
                return;
            default:
                s7 s7Var2 = this.f14697b;
                s7Var2.f14764q.d0(s7Var2.f14751b, s7Var2.f14752c, this.f14698c, true, true, s7Var2.f14761n);
                return;
        }
    }
}
