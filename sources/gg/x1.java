package gg;
public final class x1 implements Runnable {
    public final int f6796a;
    public final f2 f6797b;

    public x1(f2 f2Var, int i10) {
        this.f6796a = i10;
        this.f6797b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f6796a) {
            case 0:
                this.f6797b.W(true);
                return;
            case 1:
                this.f6797b.b0(true, false);
                return;
            case 2:
                this.f6797b.R();
                return;
            case 3:
                this.f6797b.b0(true, false);
                return;
            case 4:
                this.f6797b.b0(true, false);
                return;
            case 5:
                this.f6797b.b0(true, false);
                return;
            case 6:
                f2 f2Var = this.f6797b;
                f2Var.f6614b0.clear();
                f2Var.f6615c0.clear();
                f2Var.dismiss();
                return;
            default:
                this.f6797b.dismiss();
                return;
        }
    }
}
