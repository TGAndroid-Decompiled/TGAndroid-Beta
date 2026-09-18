package ci;
public final class y3 implements Runnable {
    public final int f5822a;
    public final b4 f5823b;

    public y3(b4 b4Var, int i10) {
        this.f5822a = i10;
        this.f5823b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f5822a) {
            case 0:
                this.f5823b.dismiss();
                return;
            default:
                b4.m(this.f5823b);
                return;
        }
    }
}
