package fi;
public final class b5 implements Runnable {
    public final int f9572a;
    public final c5 f9573b;

    public b5(c5 c5Var, int i10) {
        this.f9572a = i10;
        this.f9573b = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f9572a) {
            case 0:
                c5 c5Var = this.f9573b;
                if (c5Var.f9605w) {
                    c5Var.d();
                    return;
                }
                return;
            default:
                this.f9573b.invalidateSelf();
                return;
        }
    }
}
