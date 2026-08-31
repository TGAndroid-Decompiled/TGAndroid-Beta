package kh;
public final class i implements Runnable {
    public final int f11261a;
    public final v f11262b;

    public i(v vVar, int i10) {
        this.f11261a = i10;
        this.f11262b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f11261a) {
            case 0:
                this.f11262b.e();
                return;
            case 1:
                v.k(this.f11262b.f11318q, true, true);
                return;
            default:
                this.f11262b.e();
                return;
        }
    }
}
