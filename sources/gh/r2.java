package gh;

public final class r2 implements Runnable {

    public final int f7515a;

    public final t3 f7516b;

    public final int f7517c;

    public r2(t3 t3Var, int i10, int i11) {
        this.f7515a = i11;
        this.f7516b = t3Var;
        this.f7517c = i10;
    }

    @Override
    public final void run() {
        switch (this.f7515a) {
            case 0:
                this.f7516b.f7537f.scrollBy(0, this.f7517c);
                break;
            default:
                n3 n3Var = this.f7516b.f7537f;
                if (n3Var != null) {
                    n3Var.setSpanCount(this.f7517c);
                }
                break;
        }
    }
}
