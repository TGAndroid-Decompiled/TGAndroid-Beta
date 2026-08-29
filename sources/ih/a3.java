package ih;
public final class a3 implements Runnable {
    public final int f9016a;
    public final n3 f9017b;

    public a3(n3 n3Var, int i10) {
        this.f9016a = i10;
        this.f9017b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f9016a) {
            case 0:
                this.f9017b.setReordering(true);
                return;
            case 1:
                this.f9017b.setReordering(true);
                return;
            case 2:
                this.f9017b.f(false);
                return;
            default:
                this.f9017b.setReordering(true);
                return;
        }
    }
}
