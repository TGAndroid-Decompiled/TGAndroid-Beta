package nh;

public final class m4 implements Runnable {

    public final int f18817a;

    public final n4 f18818b;

    public m4(n4 n4Var, int i10) {
        this.f18817a = i10;
        this.f18818b = n4Var;
    }

    @Override
    public final void run() {
        switch (this.f18817a) {
            case 0:
                n4 n4Var = this.f18818b;
                if (n4Var.f18847w) {
                    n4Var.d();
                    break;
                }
                break;
            default:
                this.f18818b.invalidateSelf();
                break;
        }
    }
}
