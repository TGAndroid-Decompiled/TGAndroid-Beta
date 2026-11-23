package di;
public final class v8 implements Runnable {
    public final int f9962a;
    public final w8 f9963b;
    public final long f9964c;

    public v8(w8 w8Var, long j3, int i7) {
        this.f9962a = i7;
        this.f9963b = w8Var;
        this.f9964c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9962a) {
            case 0:
                w8 w8Var = this.f9963b;
                w8Var.f10010q.b0(w8Var.f9997b, w8Var.f9998c, this.f9964c, true, true, w8Var.f10007n);
                return;
            default:
                w8 w8Var2 = this.f9963b;
                w8Var2.f10010q.b0(w8Var2.f9997b, w8Var2.f9998c, this.f9964c, true, true, w8Var2.f10007n);
                return;
        }
    }
}
