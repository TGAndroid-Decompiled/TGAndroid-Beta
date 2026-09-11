package di;
public final class y3 implements Runnable {
    public final int f8465a;
    public final b4 f8466b;

    public y3(b4 b4Var, int i10) {
        this.f8465a = i10;
        this.f8466b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f8465a) {
            case 0:
                this.f8466b.dismiss();
                return;
            default:
                b4.m(this.f8466b);
                return;
        }
    }
}
