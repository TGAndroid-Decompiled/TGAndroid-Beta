package j4;
public final class o0 implements Runnable {
    public final int f13527a;
    public final s0 f13528b;

    public o0(s0 s0Var, int i9) {
        this.f13527a = i9;
        this.f13528b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f13527a) {
            case 0:
                this.f13528b.r();
                return;
            case 1:
                s0 s0Var = this.f13528b;
                if (!s0Var.X) {
                    z zVar = s0Var.C;
                    zVar.getClass();
                    zVar.c(s0Var);
                    return;
                }
                return;
            default:
                this.f13528b.R = true;
                return;
        }
    }
}
