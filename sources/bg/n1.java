package bg;
public final class n1 implements Runnable {
    public final int f1890a;
    public final p1 f1891b;

    public n1(p1 p1Var, int i9) {
        this.f1890a = i9;
        this.f1891b = p1Var;
    }

    @Override
    public final void run() {
        switch (this.f1890a) {
            case 0:
                p1.d0(this.f1891b);
                return;
            default:
                p1.c0(this.f1891b);
                return;
        }
    }
}
