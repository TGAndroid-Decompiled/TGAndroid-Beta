package hi;
public final class m4 implements Runnable {
    public final int f14801a;
    public final n4 f14802b;

    public m4(n4 n4Var, int i7) {
        this.f14801a = i7;
        this.f14802b = n4Var;
    }

    @Override
    public final void run() {
        switch (this.f14801a) {
            case 0:
                n4 n4Var = this.f14802b;
                if (n4Var.f14834x) {
                    n4Var.d();
                    return;
                }
                return;
            default:
                this.f14802b.invalidateSelf();
                return;
        }
    }
}
