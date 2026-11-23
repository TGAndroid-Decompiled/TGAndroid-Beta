package ai;
public final class k1 implements Runnable {
    public final int f1322a;
    public final w1 f1323b;

    public k1(w1 w1Var, int i7) {
        this.f1322a = i7;
        this.f1323b = w1Var;
    }

    @Override
    public final void run() {
        switch (this.f1322a) {
            case 0:
                this.f1323b.d(null);
                return;
            case 1:
                w1 w1Var = this.f1323b;
                w1Var.f1569g = true;
                w1Var.d(null);
                return;
            case 2:
                this.f1323b.d(null);
                return;
            default:
                this.f1323b.f(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
