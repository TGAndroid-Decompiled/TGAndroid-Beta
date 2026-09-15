package ci;
public final class y3 implements Runnable {
    public final int f5817a;
    public final b4 f5818b;

    public y3(b4 b4Var, int i10) {
        this.f5817a = i10;
        this.f5818b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f5817a) {
            case 0:
                this.f5818b.dismiss();
                return;
            default:
                b4.m(this.f5818b);
                return;
        }
    }
}
