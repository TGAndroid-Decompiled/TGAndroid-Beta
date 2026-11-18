package hi;
public final class k2 implements Runnable {
    public final int f14860a;
    public final o2 f14861b;
    public final t6 f14862c;

    public k2(o2 o2Var, t6 t6Var, int i7) {
        this.f14860a = i7;
        this.f14861b = o2Var;
        this.f14862c = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f14860a) {
            case 0:
                o2 o2Var = this.f14861b;
                o2Var.getClass();
                org.telegram.messenger.g0.h3(new k2(o2Var, this.f14862c, 1), 320L);
                return;
            default:
                o2 o2Var2 = this.f14861b;
                o2Var2.getClass();
                this.f14862c.a(new ai.g0(o2Var2, 24));
                return;
        }
    }
}
