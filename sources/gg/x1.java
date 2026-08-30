package gg;
public final class x1 implements Runnable {
    public final int f6809a;
    public final f2 f6810b;

    public x1(f2 f2Var, int i10) {
        this.f6809a = i10;
        this.f6810b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f6809a) {
            case 0:
                this.f6810b.W(true);
                return;
            case 1:
                this.f6810b.b0(true, false);
                return;
            case 2:
                this.f6810b.R();
                return;
            case 3:
                this.f6810b.b0(true, false);
                return;
            case 4:
                this.f6810b.b0(true, false);
                return;
            case 5:
                this.f6810b.b0(true, false);
                return;
            case 6:
                f2 f2Var = this.f6810b;
                f2Var.f6627b0.clear();
                f2Var.f6628c0.clear();
                f2Var.dismiss();
                return;
            default:
                this.f6810b.dismiss();
                return;
        }
    }
}
