package oh;
public final class f implements Runnable {
    public final int f14258a;
    public final q f14259b;

    public f(q qVar, int i10) {
        this.f14258a = i10;
        this.f14259b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f14258a) {
            case 0:
                this.f14259b.e();
                return;
            case 1:
                q.k(this.f14259b.f14306q, true, true);
                return;
            default:
                this.f14259b.e();
                return;
        }
    }
}
