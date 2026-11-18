package di;
public final class u8 implements Runnable {
    public final int f9882a;
    public final v8 f9883b;
    public final long f9884c;

    public u8(v8 v8Var, long j3, int i7) {
        this.f9882a = i7;
        this.f9883b = v8Var;
        this.f9884c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9882a) {
            case 0:
                v8 v8Var = this.f9883b;
                v8Var.f9948q.b0(v8Var.f9935b, v8Var.f9936c, this.f9884c, true, true, v8Var.f9945n);
                return;
            default:
                v8 v8Var2 = this.f9883b;
                v8Var2.f9948q.b0(v8Var2.f9935b, v8Var2.f9936c, this.f9884c, true, true, v8Var2.f9945n);
                return;
        }
    }
}
