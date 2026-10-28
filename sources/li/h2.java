package li;
public final class h2 implements Runnable {
    public final int f17275a;
    public final v3 f17276b;
    public final int f17277c;

    public h2(v3 v3Var, int i10, int i11) {
        this.f17275a = i11;
        this.f17276b = v3Var;
        this.f17277c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17275a) {
            case 0:
                this.f17276b.j4(this.f17277c);
                return;
            case 1:
                this.f17276b.l4(this.f17277c);
                return;
            case 2:
                this.f17276b.scrollBy(0, this.f17277c);
                return;
            default:
                this.f17276b.k4(this.f17277c);
                return;
        }
    }
}
