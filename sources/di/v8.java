package di;
public final class v8 implements Runnable {
    public final int f9929a;
    public final w8 f9930b;
    public final long f9931c;

    public v8(w8 w8Var, long j3, int i7) {
        this.f9929a = i7;
        this.f9930b = w8Var;
        this.f9931c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9929a) {
            case 0:
                w8 w8Var = this.f9930b;
                w8Var.f9973q.b0(w8Var.f9960b, w8Var.f9961c, this.f9931c, true, true, w8Var.f9970n);
                return;
            default:
                w8 w8Var2 = this.f9930b;
                w8Var2.f9973q.b0(w8Var2.f9960b, w8Var2.f9961c, this.f9931c, true, true, w8Var2.f9970n);
                return;
        }
    }
}
