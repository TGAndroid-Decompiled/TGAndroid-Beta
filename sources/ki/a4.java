package ki;
public final class a4 implements Runnable {
    public final int f18605a;
    public final b4 f18606b;

    public a4(b4 b4Var, int i7) {
        this.f18605a = i7;
        this.f18606b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f18605a) {
            case 0:
                b4 b4Var = this.f18606b;
                if (b4Var.f18626x) {
                    b4Var.d();
                    return;
                }
                return;
            default:
                this.f18606b.invalidateSelf();
                return;
        }
    }
}
