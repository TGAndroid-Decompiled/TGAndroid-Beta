package ai;
public final class j1 implements Runnable {
    public final int f1306a;
    public final v1 f1307b;

    public j1(v1 v1Var, int i7) {
        this.f1306a = i7;
        this.f1307b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f1306a) {
            case 0:
                this.f1307b.d(null);
                return;
            case 1:
                v1 v1Var = this.f1307b;
                v1Var.f1557g = true;
                v1Var.d(null);
                return;
            case 2:
                this.f1307b.d(null);
                return;
            default:
                this.f1307b.f(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
