package hi;
public final class j2 implements Runnable {
    public final int f14822a;
    public final n2 f14823b;
    public final s6 f14824c;

    public j2(n2 n2Var, s6 s6Var, int i7) {
        this.f14822a = i7;
        this.f14823b = n2Var;
        this.f14824c = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f14822a) {
            case 0:
                n2 n2Var = this.f14823b;
                n2Var.getClass();
                org.telegram.messenger.g0.h3(new j2(n2Var, this.f14824c, 1), 320L);
                return;
            default:
                n2 n2Var2 = this.f14823b;
                n2Var2.getClass();
                this.f14824c.a(new ai.h0(n2Var2, 24));
                return;
        }
    }
}
