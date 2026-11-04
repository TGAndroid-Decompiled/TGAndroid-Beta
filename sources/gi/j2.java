package gi;
public final class j2 implements Runnable {
    public final int f13001a;
    public final n2 f13002b;
    public final j8 f13003c;

    public j2(n2 n2Var, j8 j8Var, int i3) {
        this.f13001a = i3;
        this.f13002b = n2Var;
        this.f13003c = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f13001a) {
            case 0:
                n2 n2Var = this.f13002b;
                n2Var.getClass();
                org.telegram.messenger.g0.i3(new j2(n2Var, this.f13003c, 1), 320L);
                return;
            default:
                n2 n2Var2 = this.f13002b;
                n2Var2.getClass();
                this.f13003c.a(new ai.v2(n2Var2, 22));
                return;
        }
    }
}
