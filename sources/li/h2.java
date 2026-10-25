package li;
public final class h2 implements Runnable {
    public final int f17276a;
    public final v3 f17277b;
    public final int f17278c;

    public h2(v3 v3Var, int i10, int i11) {
        this.f17276a = i11;
        this.f17277b = v3Var;
        this.f17278c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17276a) {
            case 0:
                this.f17277b.j4(this.f17278c);
                return;
            case 1:
                this.f17277b.l4(this.f17278c);
                return;
            case 2:
                this.f17277b.scrollBy(0, this.f17278c);
                return;
            default:
                this.f17277b.k4(this.f17278c);
                return;
        }
    }
}
