package di;
public final class y3 implements Runnable {
    public final int f8493a;
    public final b4 f8494b;

    public y3(b4 b4Var, int i10) {
        this.f8493a = i10;
        this.f8494b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f8493a) {
            case 0:
                this.f8494b.dismiss();
                return;
            default:
                b4.m(this.f8494b);
                return;
        }
    }
}
