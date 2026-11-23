package di;
public final class v8 implements Runnable {
    public final int f9923a;
    public final w8 f9924b;
    public final long f9925c;

    public v8(w8 w8Var, long j3, int i7) {
        this.f9923a = i7;
        this.f9924b = w8Var;
        this.f9925c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9923a) {
            case 0:
                w8 w8Var = this.f9924b;
                w8Var.f9971q.b0(w8Var.f9958b, w8Var.f9959c, this.f9925c, true, true, w8Var.f9968n);
                return;
            default:
                w8 w8Var2 = this.f9924b;
                w8Var2.f9971q.b0(w8Var2.f9958b, w8Var2.f9959c, this.f9925c, true, true, w8Var2.f9968n);
                return;
        }
    }
}
