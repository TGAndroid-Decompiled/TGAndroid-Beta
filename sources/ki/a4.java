package ki;
public final class a4 implements Runnable {
    public final int f18602a;
    public final b4 f18603b;

    public a4(b4 b4Var, int i7) {
        this.f18602a = i7;
        this.f18603b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f18602a) {
            case 0:
                b4 b4Var = this.f18603b;
                if (b4Var.f18623x) {
                    b4Var.d();
                    return;
                }
                return;
            default:
                this.f18603b.invalidateSelf();
                return;
        }
    }
}
