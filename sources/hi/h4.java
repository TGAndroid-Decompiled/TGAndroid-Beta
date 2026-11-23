package hi;
public final class h4 implements Runnable {
    public final int f14578a;
    public final v5 f14579b;
    public final tg.w1 f14580c;

    public h4(v5 v5Var, tg.w1 w1Var, int i7) {
        this.f14578a = i7;
        this.f14579b = v5Var;
        this.f14580c = w1Var;
    }

    @Override
    public final void run() {
        switch (this.f14578a) {
            case 0:
                this.f14579b.D0(this.f14580c, true);
                return;
            default:
                this.f14579b.B0(this.f14580c);
                return;
        }
    }
}
