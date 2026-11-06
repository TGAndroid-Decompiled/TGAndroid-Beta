package di;
public final class v6 implements Runnable {
    public final int f9871a;
    public final x6 f9872b;

    public v6(x6 x6Var, int i7) {
        this.f9871a = i7;
        this.f9872b = x6Var;
    }

    @Override
    public final void run() {
        switch (this.f9871a) {
            case 0:
                this.f9872b.e();
                return;
            default:
                this.f9872b.b();
                return;
        }
    }
}
