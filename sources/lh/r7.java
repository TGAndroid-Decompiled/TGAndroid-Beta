package lh;
public final class r7 implements Runnable {
    public final int f13015a;
    public final s7 f13016b;
    public final long f13017c;

    public r7(s7 s7Var, long j10, int i10) {
        this.f13015a = i10;
        this.f13016b = s7Var;
        this.f13017c = j10;
    }

    @Override
    public final void run() {
        switch (this.f13015a) {
            case 0:
                s7 s7Var = this.f13016b;
                s7Var.f13076q.d0(s7Var.f13064b, s7Var.f13065c, this.f13017c, true, true, s7Var.f13073n);
                return;
            default:
                s7 s7Var2 = this.f13016b;
                s7Var2.f13076q.d0(s7Var2.f13064b, s7Var2.f13065c, this.f13017c, true, true, s7Var2.f13073n);
                return;
        }
    }
}
