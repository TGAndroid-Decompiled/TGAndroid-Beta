package fi;
public final class a5 implements Runnable {
    public final int f9169a;
    public final b5 f9170b;

    public a5(b5 b5Var, int i10) {
        this.f9169a = i10;
        this.f9170b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f9169a) {
            case 0:
                b5 b5Var = this.f9170b;
                if (b5Var.f9199w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f9170b.invalidateSelf();
                return;
        }
    }
}
