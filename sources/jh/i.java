package jh;
public final class i implements Runnable {
    public final int f9441a;
    public final v f9442b;

    public i(v vVar, int i10) {
        this.f9441a = i10;
        this.f9442b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f9441a) {
            case 0:
                this.f9442b.e();
                return;
            case 1:
                v.k(this.f9442b.f9492q, true, true);
                return;
            default:
                this.f9442b.e();
                return;
        }
    }
}
