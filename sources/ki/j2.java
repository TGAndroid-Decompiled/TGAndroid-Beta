package ki;
public final class j2 implements Runnable {
    public final int f15343a;
    public final w3 f15344b;
    public final int f15345c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f15343a = i11;
        this.f15344b = w3Var;
        this.f15345c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15343a) {
            case 0:
                this.f15344b.e4(this.f15345c);
                return;
            case 1:
                this.f15344b.g4(this.f15345c);
                return;
            case 2:
                this.f15344b.scrollBy(0, this.f15345c);
                return;
            default:
                this.f15344b.f4(this.f15345c);
                return;
        }
    }
}
