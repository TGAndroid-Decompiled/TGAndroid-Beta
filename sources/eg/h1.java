package eg;
public final class h1 implements Runnable {
    public final int f6027a;
    public final j1 f6028b;

    public h1(j1 j1Var, int i10) {
        this.f6027a = i10;
        this.f6028b = j1Var;
    }

    @Override
    public final void run() {
        switch (this.f6027a) {
            case 0:
                j1.e0(this.f6028b);
                return;
            default:
                j1.d0(this.f6028b);
                return;
        }
    }
}
