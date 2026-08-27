package gh;

public final class z1 implements Runnable {

    public final int f7694a;

    public final b2 f7695b;

    public final boolean f7696c;

    public z1(b2 b2Var, boolean z10, int i10) {
        this.f7694a = i10;
        this.f7695b = b2Var;
        this.f7696c = z10;
    }

    @Override
    public final void run() {
        switch (this.f7694a) {
            case 0:
                boolean z10 = this.f7696c;
                b2 b2Var = this.f7695b;
                if (!z10) {
                    b2Var.C.setVisibility(8);
                } else {
                    b2Var.getClass();
                }
                break;
            default:
                boolean z11 = this.f7696c;
                b2 b2Var2 = this.f7695b;
                if (!z11) {
                    b2Var2.v.setVisibility(8);
                } else {
                    b2Var2.getClass();
                }
                break;
        }
    }
}
