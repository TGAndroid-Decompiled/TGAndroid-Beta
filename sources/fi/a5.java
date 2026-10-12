package fi;
public final class a5 implements Runnable {
    public final int f9166a;
    public final b5 f9167b;

    public a5(b5 b5Var, int i10) {
        this.f9166a = i10;
        this.f9167b = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f9166a) {
            case 0:
                b5 b5Var = this.f9167b;
                if (b5Var.f9196w) {
                    b5Var.d();
                    return;
                }
                return;
            default:
                this.f9167b.invalidateSelf();
                return;
        }
    }
}
