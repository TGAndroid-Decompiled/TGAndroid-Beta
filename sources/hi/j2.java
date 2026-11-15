package hi;
public final class j2 implements Runnable {
    public final int f14455a;
    public final n2 f14456b;
    public final g7 f14457c;

    public j2(n2 n2Var, g7 g7Var, int i7) {
        this.f14455a = i7;
        this.f14456b = n2Var;
        this.f14457c = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f14455a) {
            case 0:
                n2 n2Var = this.f14456b;
                n2Var.getClass();
                org.telegram.messenger.g0.i3(new j2(n2Var, this.f14457c, 1), 320L);
                return;
            default:
                n2 n2Var2 = this.f14456b;
                n2Var2.getClass();
                this.f14457c.a(new ai.f0(n2Var2, 23));
                return;
        }
    }
}
