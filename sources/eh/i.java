package eh;
public final class i implements Runnable {
    public final int f5199a;
    public final x f5200b;

    public i(x xVar, int i9) {
        this.f5199a = i9;
        this.f5200b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f5199a) {
            case 0:
                this.f5200b.e();
                return;
            case 1:
                x.k(this.f5200b.f5260q, true, true);
                return;
            default:
                this.f5200b.e();
                return;
        }
    }
}
