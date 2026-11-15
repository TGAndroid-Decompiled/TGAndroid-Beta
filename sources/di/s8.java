package di;
public final class s8 implements Runnable {
    public final int f9403a;
    public final t8 f9404b;
    public final long f9405c;

    public s8(t8 t8Var, long j3, int i7) {
        this.f9403a = i7;
        this.f9404b = t8Var;
        this.f9405c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9403a) {
            case 0:
                t8 t8Var = this.f9404b;
                t8Var.f9489q.b0(t8Var.f9476b, t8Var.f9477c, this.f9405c, true, true, t8Var.f9486n);
                return;
            default:
                t8 t8Var2 = this.f9404b;
                t8Var2.f9489q.b0(t8Var2.f9476b, t8Var2.f9477c, this.f9405c, true, true, t8Var2.f9486n);
                return;
        }
    }
}
