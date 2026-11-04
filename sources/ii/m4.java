package ii;
public final class m4 implements Runnable {
    public final int f15081a;
    public final n4 f15082b;

    public m4(n4 n4Var, int i3) {
        this.f15081a = i3;
        this.f15082b = n4Var;
    }

    @Override
    public final void run() {
        switch (this.f15081a) {
            case 0:
                n4 n4Var = this.f15082b;
                if (n4Var.f15117x) {
                    n4Var.d();
                    return;
                }
                return;
            default:
                this.f15082b.invalidateSelf();
                return;
        }
    }
}
