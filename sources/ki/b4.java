package ki;
public final class b4 implements Runnable {
    public final int f18683a;
    public final c4 f18684b;

    public b4(c4 c4Var, int i7) {
        this.f18683a = i7;
        this.f18684b = c4Var;
    }

    @Override
    public final void run() {
        switch (this.f18683a) {
            case 0:
                c4 c4Var = this.f18684b;
                if (c4Var.f18709x) {
                    c4Var.d();
                    return;
                }
                return;
            default:
                this.f18684b.invalidateSelf();
                return;
        }
    }
}
