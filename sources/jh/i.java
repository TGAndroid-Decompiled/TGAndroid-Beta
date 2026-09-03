package jh;
public final class i implements Runnable {
    public final int f9422a;
    public final v f9423b;

    public i(v vVar, int i10) {
        this.f9422a = i10;
        this.f9423b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f9422a) {
            case 0:
                this.f9423b.e();
                return;
            case 1:
                v.k(this.f9423b.f9473q, true, true);
                return;
            default:
                this.f9423b.e();
                return;
        }
    }
}
