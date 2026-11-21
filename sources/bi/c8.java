package bi;
public final class c8 implements Runnable {
    public final int f3487a;
    public final j8 f3488b;

    public c8(j8 j8Var, int i7) {
        this.f3487a = i7;
        this.f3488b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f3487a) {
            case 0:
                this.f3488b.e1();
                return;
            default:
                j8 j8Var = this.f3488b;
                j8Var.f3757e2.O(true);
                org.telegram.messenger.g0.h3(new c8(j8Var, 0), 150L);
                return;
        }
    }
}
