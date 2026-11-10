package di;
public final class w6 implements Runnable {
    public final int f9904a;
    public final y6 f9905b;

    public w6(y6 y6Var, int i7) {
        this.f9904a = i7;
        this.f9905b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f9904a) {
            case 0:
                this.f9905b.e();
                return;
            default:
                this.f9905b.b();
                return;
        }
    }
}
