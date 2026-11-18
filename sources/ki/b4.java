package ki;
public final class b4 implements Runnable {
    public final int f18596a;
    public final c4 f18597b;

    public b4(c4 c4Var, int i7) {
        this.f18596a = i7;
        this.f18597b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f18596a) {
            case 0:
                c4 c4Var = this.f18597b;
                if (c4Var.f18618x) {
                    c4Var.d();
                    return;
                }
                return;
            default:
                this.f18597b.invalidateSelf();
                return;
        }
    }
}
