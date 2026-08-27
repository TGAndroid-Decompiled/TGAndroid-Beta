package cg;

public final class a2 implements Runnable {

    public final int f2601a;

    public final i2 f2602b;

    public a2(i2 i2Var, int i10) {
        this.f2601a = i10;
        this.f2602b = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f2601a) {
            case 0:
                this.f2602b.W(true);
                break;
            case 1:
                this.f2602b.b0(true, false);
                break;
            case 2:
                this.f2602b.R();
                break;
            case 3:
                this.f2602b.b0(true, false);
                break;
            case 4:
                this.f2602b.b0(true, false);
                break;
            case 5:
                this.f2602b.b0(true, false);
                break;
            case 6:
                i2 i2Var = this.f2602b;
                i2Var.f2709a0.clear();
                i2Var.f2710b0.clear();
                i2Var.dismiss();
                break;
            default:
                this.f2602b.dismiss();
                break;
        }
    }
}
