package fh;
public final class j6 implements Runnable {
    public final int f6557a;
    public final u6 f6558b;

    public j6(u6 u6Var, int i9) {
        this.f6557a = i9;
        this.f6558b = u6Var;
    }

    @Override
    public final void run() {
        switch (this.f6557a) {
            case 0:
                this.f6558b.X(false);
                return;
            case 1:
                this.f6558b.X(true);
                return;
            case 2:
                u6.T(this.f6558b);
                return;
            case 3:
                u6.S(this.f6558b);
                return;
            case 4:
                u6.Q(this.f6558b);
                return;
            default:
                this.f6558b.dismiss();
                return;
        }
    }
}
