package fi;
public final class b5 implements Runnable {
    public final int f9600a;
    public final c5 f9601b;

    public b5(c5 c5Var, int i10) {
        this.f9600a = i10;
        this.f9601b = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f9600a) {
            case 0:
                c5 c5Var = this.f9601b;
                if (c5Var.f9633w) {
                    c5Var.d();
                    return;
                }
                return;
            default:
                this.f9601b.invalidateSelf();
                return;
        }
    }
}
