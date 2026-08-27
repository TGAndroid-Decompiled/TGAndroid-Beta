package gh;

public final class g3 implements Runnable {

    public final int f7269a;

    public final t3 f7270b;

    public g3(t3 t3Var, int i10) {
        this.f7269a = i10;
        this.f7270b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f7269a) {
            case 0:
                this.f7270b.setReordering(true);
                break;
            case 1:
                this.f7270b.setReordering(true);
                break;
            case 2:
                this.f7270b.f(false);
                break;
            default:
                this.f7270b.setReordering(true);
                break;
        }
    }
}
