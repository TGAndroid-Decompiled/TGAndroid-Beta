package di;
public final class v8 implements Runnable {
    public final int f9959a;
    public final w8 f9960b;
    public final long f9961c;

    public v8(w8 w8Var, long j3, int i7) {
        this.f9959a = i7;
        this.f9960b = w8Var;
        this.f9961c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9959a) {
            case 0:
                w8 w8Var = this.f9960b;
                w8Var.f10007q.b0(w8Var.f9994b, w8Var.f9995c, this.f9961c, true, true, w8Var.f10004n);
                return;
            default:
                w8 w8Var2 = this.f9960b;
                w8Var2.f10007q.b0(w8Var2.f9994b, w8Var2.f9995c, this.f9961c, true, true, w8Var2.f10004n);
                return;
        }
    }
}
