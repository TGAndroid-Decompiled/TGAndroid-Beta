package hi;
public final class j2 implements Runnable {
    public final int f14759a;
    public final n2 f14760b;
    public final t6 f14761c;

    public j2(n2 n2Var, t6 t6Var, int i7) {
        this.f14759a = i7;
        this.f14760b = n2Var;
        this.f14761c = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f14759a) {
            case 0:
                n2 n2Var = this.f14760b;
                n2Var.getClass();
                org.telegram.messenger.g0.h3(new j2(n2Var, this.f14761c, 1), 320L);
                return;
            default:
                n2 n2Var2 = this.f14760b;
                n2Var2.getClass();
                this.f14761c.a(new ai.c0(n2Var2, 24));
                return;
        }
    }
}
