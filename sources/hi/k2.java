package hi;
public final class k2 implements Runnable {
    public final int f14857a;
    public final o2 f14858b;
    public final t6 f14859c;

    public k2(o2 o2Var, t6 t6Var, int i7) {
        this.f14857a = i7;
        this.f14858b = o2Var;
        this.f14859c = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f14857a) {
            case 0:
                o2 o2Var = this.f14858b;
                o2Var.getClass();
                org.telegram.messenger.g0.h3(new k2(o2Var, this.f14859c, 1), 320L);
                return;
            default:
                o2 o2Var2 = this.f14858b;
                o2Var2.getClass();
                this.f14859c.a(new ai.g0(o2Var2, 24));
                return;
        }
    }
}
