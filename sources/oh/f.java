package oh;
public final class f implements Runnable {
    public final int f14257a;
    public final q f14258b;

    public f(q qVar, int i10) {
        this.f14257a = i10;
        this.f14258b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f14257a) {
            case 0:
                this.f14258b.e();
                return;
            case 1:
                q.k(this.f14258b.f14305q, true, true);
                return;
            default:
                this.f14258b.e();
                return;
        }
    }
}
