package ei;
public final class w6 implements Runnable {
    public final int f11187a;
    public final y6 f11188b;

    public w6(y6 y6Var, int i3) {
        this.f11187a = i3;
        this.f11188b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f11187a) {
            case 0:
                this.f11188b.e();
                return;
            default:
                this.f11188b.b();
                return;
        }
    }
}
