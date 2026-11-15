package ki;
public final class g4 implements Runnable {
    public final int f18319a;
    public final h4 f18320b;

    public g4(h4 h4Var, int i7) {
        this.f18319a = i7;
        this.f18320b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f18319a) {
            case 0:
                h4 h4Var = this.f18320b;
                if (h4Var.f18352x) {
                    h4Var.d();
                    return;
                }
                return;
            default:
                this.f18320b.invalidateSelf();
                return;
        }
    }
}
