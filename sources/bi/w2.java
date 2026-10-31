package bi;
public final class w2 implements Runnable {
    public final int f3433a;
    public final d4 f3434b;
    public final int f3435c;
    public final int d;

    public w2(d4 d4Var, int i10, int i11, int i12) {
        this.f3433a = i12;
        this.f3434b = d4Var;
        this.f3435c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f3433a) {
            case 0:
                this.f3434b.b2(this.f3435c, this.d);
                return;
            default:
                this.f3434b.j4(this.f3435c, this.d);
                return;
        }
    }
}
