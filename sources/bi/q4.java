package bi;
public final class q4 implements Runnable {
    public final int f3450a;
    public final t4 f3451b;

    public q4(t4 t4Var, int i10) {
        this.f3450a = i10;
        this.f3451b = t4Var;
    }

    @Override
    public final void run() {
        switch (this.f3450a) {
            case 0:
                this.f3451b.dismiss();
                return;
            default:
                t4.m(this.f3451b);
                return;
        }
    }
}
