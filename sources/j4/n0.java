package j4;

public final class n0 implements Runnable {

    public final int f12624a;

    public final r0 f12625b;

    public n0(r0 r0Var, int i10) {
        this.f12624a = i10;
        this.f12625b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f12624a) {
            case 0:
                this.f12625b.k();
                break;
            case 1:
                r0 r0Var = this.f12625b;
                if (!r0Var.W) {
                    y yVar = r0Var.B;
                    yVar.getClass();
                    yVar.a(r0Var);
                }
                break;
            default:
                this.f12625b.Q = true;
                break;
        }
    }
}
