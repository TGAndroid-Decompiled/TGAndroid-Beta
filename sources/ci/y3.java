package ci;
public final class y3 implements Runnable {
    public final int f5821a;
    public final b4 f5822b;

    public y3(b4 b4Var, int i10) {
        this.f5821a = i10;
        this.f5822b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f5821a) {
            case 0:
                this.f5822b.dismiss();
                return;
            default:
                b4.m(this.f5822b);
                return;
        }
    }
}
