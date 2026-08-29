package hh;
public final class i implements Runnable {
    public final int f8077a;
    public final v f8078b;

    public i(v vVar, int i10) {
        this.f8077a = i10;
        this.f8078b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f8077a) {
            case 0:
                this.f8078b.e();
                return;
            case 1:
                v.k(this.f8078b.f8134q, true, true);
                return;
            default:
                this.f8078b.e();
                return;
        }
    }
}
