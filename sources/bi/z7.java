package bi;
public final class z7 implements Runnable {
    public final int f4315a;
    public final g8 f4316b;

    public z7(g8 g8Var, int i7) {
        this.f4315a = i7;
        this.f4316b = g8Var;
    }

    @Override
    public final void run() {
        switch (this.f4315a) {
            case 0:
                this.f4316b.e1();
                return;
            default:
                g8 g8Var = this.f4316b;
                g8Var.f3659e2.O(true);
                org.telegram.messenger.g0.h3(new z7(g8Var, 0), 150L);
                return;
        }
    }
}
