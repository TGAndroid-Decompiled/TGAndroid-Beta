package di;
public final class u8 implements Runnable {
    public final int f9879a;
    public final v8 f9880b;
    public final long f9881c;

    public u8(v8 v8Var, long j3, int i7) {
        this.f9879a = i7;
        this.f9880b = v8Var;
        this.f9881c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9879a) {
            case 0:
                v8 v8Var = this.f9880b;
                v8Var.f9945q.b0(v8Var.f9932b, v8Var.f9933c, this.f9881c, true, true, v8Var.f9942n);
                return;
            default:
                v8 v8Var2 = this.f9880b;
                v8Var2.f9945q.b0(v8Var2.f9932b, v8Var2.f9933c, this.f9881c, true, true, v8Var2.f9942n);
                return;
        }
    }
}
