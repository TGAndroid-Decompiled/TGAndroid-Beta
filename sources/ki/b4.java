package ki;
public final class b4 implements Runnable {
    public final int f18593a;
    public final c4 f18594b;

    public b4(c4 c4Var, int i7) {
        this.f18593a = i7;
        this.f18594b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f18593a) {
            case 0:
                c4 c4Var = this.f18594b;
                if (c4Var.f18615x) {
                    c4Var.d();
                    return;
                }
                return;
            default:
                this.f18594b.invalidateSelf();
                return;
        }
    }
}
