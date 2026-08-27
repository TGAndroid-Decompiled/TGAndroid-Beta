package fh;

public final class i implements Runnable {

    public final int f6130a;

    public final v f6131b;

    public i(v vVar, int i10) {
        this.f6130a = i10;
        this.f6131b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f6130a) {
            case 0:
                this.f6131b.e();
                break;
            case 1:
                v.k(this.f6131b.f6187q, true, true);
                break;
            default:
                this.f6131b.e();
                break;
        }
    }
}
